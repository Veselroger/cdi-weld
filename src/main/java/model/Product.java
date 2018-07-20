package model;

public class Product {

    private ProductCode code;

    public Product(ProductCode code) {
        this.code = code;
    }

    public ProductCode getCode() {
        return this.code;
    }
}
