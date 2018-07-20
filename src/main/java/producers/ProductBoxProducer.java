package producers;

import model.Product;
import model.ProductBox;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.ArrayList;
import java.util.List;

/**
 * Продюссер для CDI инжекта.
 * <p>Методы, аннотированные @Produces "производят" объект для инжекта.</p>
 * <p>Важно, что если тут будет ключевое слово new, то от этого объект не станет CDI!</p>
 */
public class ProductBoxProducer {

    @Produces
    public ProductBox newProductBox(InjectionPoint injectionPoint) {
        return new ProductBox() {
            private List<Product> products = new ArrayList<>();

            @Override
            public List<Product> getProducts() {
                return products;
            }
        };
    }

    public void clearBox(@Disposes ProductBox box) {
        box.getProducts().clear();
    }
}
