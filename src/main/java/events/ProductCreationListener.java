package events;

import javax.enterprise.event.Observes;

/**
 * Слушатель событий создания продуктов.
 * <p>Метод слушателя, параметр которого аннотирован @Observes срабатывает тогда,
 * когда {@link ProductCreationObserver}</p> зарегистрирует событие.
 */
public class ProductCreationListener {

    public void logEvent(@Observes ProductCreationEvent event) {
        System.out.println("Created. Code=" + event.getCode().getValue());
    }

}
