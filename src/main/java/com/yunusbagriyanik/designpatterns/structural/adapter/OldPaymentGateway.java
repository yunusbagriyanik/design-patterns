package com.yunusbagriyanik.designpatterns.structural.adapter;

public class OldPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("OldPaymentGateway.processPayment with amount: " + amount);
    }
}
