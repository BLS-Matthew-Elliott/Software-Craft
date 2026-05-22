package com.example.craft.discount;

import com.example.craft.domain.Order;
import com.example.craft.domain.OrderItem;

public class LoyaltyDiscountStrategy implements DiscountStrategy {

    private static final double LOYALTY_DISCOUNT_RATE = 0.12;
    private static final int LOYALTY_SUBTOTAL_THRESHOLD = 7500;
    private static final int LOYALTY_SUBTOTAL_BONUS = 200;
    private static final int LOYALTY_ITEM_THRESHOLD = 3;
    private static final int LOYALTY_ITEM_BONUS = 150;
    private static final double MAX_DISCOUNT_RATE = 0.25;

    @Override
    public int calculateDiscount(Order order, int subtotal) {
        int discount = (int) (subtotal * LOYALTY_DISCOUNT_RATE);

        if (subtotal > LOYALTY_SUBTOTAL_THRESHOLD) {
            discount += LOYALTY_SUBTOTAL_BONUS;
        }

        if (countItems(order) > LOYALTY_ITEM_THRESHOLD) {
            discount += LOYALTY_ITEM_BONUS;
        }

        int maximumDiscount = (int) (subtotal * MAX_DISCOUNT_RATE);

        return Math.min(discount, maximumDiscount);
    }

    int countItems(Order order) {
        int itemCount = 0;

        for (OrderItem item : order.getItems()) {
            itemCount += item.getQuantity();
        }

        return itemCount;
    }
}