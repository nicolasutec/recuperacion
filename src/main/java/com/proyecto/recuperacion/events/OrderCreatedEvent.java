package com.proyecto.recuperacion.events;

import org.springframework.context.ApplicationEvent;
import java.util.List;
import lombok.Getter;

@Getter
public class OrderCreatedEvent extends ApplicationEvent {

    private final Long orderId;
    private final String customerEmail;
    private final List<String> products;

    public OrderCreatedEvent(Object source, Long orderId, String customerEmail, List<String> products) {
        super(source);
        this.orderId = orderId;
        this.customerEmail = customerEmail;
        this.products = products;
    }
}
