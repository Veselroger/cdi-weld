package events;

import model.ProductCode;

/**
 * Событие создания продукта.
 * <p>Событие является носителем информации.
 */
public class ProductCreationEvent {
    private ProductCode code;

    public ProductCreationEvent(ProductCode code) {
        this.code = code;
    }

    public ProductCode getCode() {
        return code;
    }
}
