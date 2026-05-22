package com.example.craft.notification;

import com.example.craft.domain.Customer;

public interface Notifier {
    void notifyCustomer(Customer customer, String message);
}