package service;

import events.ProductCreationEvent;
import events.ProductCreationObserver;
import interceptors.ProductionLog;
import model.Product;
import model.ProductBox;
import model.ProductCode;
import qualifiers.CodeType;

import javax.inject.Inject;

/**
 * Сервис по работе с продкутами.
 */
public class ProductService {

    @Inject
    @CodeType(type = CodeType.Type.DIGIT)
    private ProductCode code;

    @Inject
    private ProductBox productBox;

    @Inject
    private ProductCreationObserver observer;

    @ProductionLog
    public Product getProduct() {
        Product product = new Product(code);
        productBox.getProducts().add(product);
        observer.observe(new ProductCreationEvent(product.getCode()));
        return product;
    }

    public ProductBox getProductBox() {
        return productBox;
    }

}
