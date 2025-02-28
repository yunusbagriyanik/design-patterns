package com.yunusbagriyanik.designpatterns.behavioral.strategy;

public class PayPalPayment implements PaymentService {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " TL was made using PayPal account: " + email);
    }
}
