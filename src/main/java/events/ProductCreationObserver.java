package events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * Наблюдатель за событиями.
 * <p>На вход получат событие и регистрирует для него CDI Event.</p>
 */
public class ProductCreationObserver {

    @Inject
    private Event<ProductCreationEvent> event;

    public void observe(ProductCreationEvent logEvent) {
        event.fire(logEvent);
    }
}
