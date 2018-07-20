package model;

import qualifiers.CodeType;

import java.util.Random;

@CodeType(type = CodeType.Type.LITERAL)
public class LiteralCode implements ProductCode {

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder(5);
        for (int i = 0; i < sb.capacity(); i++) {
            sb.append((char) (new Random().nextInt(25) + 65));
        }
        return sb.toString();
    }
}
