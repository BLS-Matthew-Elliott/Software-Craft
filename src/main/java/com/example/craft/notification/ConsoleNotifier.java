package com.example.craft.notification;

import com.example.craft.domain.Customer;

public class ConsoleNotifier implements Notifier {

    @Override
    public void notifyCustomer(Customer customer, String message) {
        System.out.println("Sending notification to " + customer.getEmail());
        System.out.println(message);
    }
}