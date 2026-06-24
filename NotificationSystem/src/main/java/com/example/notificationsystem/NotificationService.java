package com.example.notificationsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final OrderRepository orderRepository;

    @Value("${notification.prefix}")
    private String prefix;

    public NotificationService(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;
    }

    public String buildNotification() {
        return prefix + " " + orderRepository.getOrderInfo() + " was processed.";
    }
}
