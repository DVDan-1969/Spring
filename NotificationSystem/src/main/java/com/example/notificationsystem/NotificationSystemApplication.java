package com.example.notificationsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationSystemApplication implements CommandLineRunner {

	private final OrderManager orderManager;
	public NotificationSystemApplication(OrderManager orderManager) {
		this.orderManager = orderManager;
	}
	public static void main(String[] args) {

		SpringApplication.run(NotificationSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		orderManager.processOrder();
	}
}


