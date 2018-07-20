package model;

import java.util.List;

// CDI bean can't be abstract
public abstract class ProductBox {

    public abstract List<Product> getProducts();
}
