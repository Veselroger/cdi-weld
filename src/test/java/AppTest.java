import model.Product;
import model.ProductBox;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.ProductService;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private SeContainerInitializer containerInit;
    private SeContainer container;

    @Before
    public void before() {
        containerInit = SeContainerInitializer.newInstance();
        container = containerInit.initialize();
    }

    @After
    public void after() {
        container.close();
    }

    @Test
    public void shouldCreateProductWithCode() {
        ProductService service = container.select(ProductService.class).get();
        Product product = service.getProduct();
        assertTrue(product.getCode().getValue() != null);
    }

    @Test
    public void shouldAddProductToTheBox() {
        ProductService service = container.select(ProductService.class).get();
        Product product = service.getProduct();
        ProductBox productBox = service.getProductBox();
        assertEquals(product, productBox.getProducts().get(0));
    }

}
