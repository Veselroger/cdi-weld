package model;

import qualifiers.CodeType;

import java.util.Random;

@CodeType(type = CodeType.Type.DIGIT)
public class DigitCode implements ProductCode {

    private final int rnd = new Random().nextInt(100);

    public String getValue() {
        return String.valueOf(rnd);
    }

}
