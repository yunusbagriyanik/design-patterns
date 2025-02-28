package com.yunusbagriyanik.designpatterns.structural.adapter;

public class PaymentGatewayAdapter implements PaymentProcessor {
    private final PaymentGateway oldPaymentGateway;

    public PaymentGatewayAdapter(PaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public void process(double amount, String currency) {
        System.out.println("Adapter converting payment to " + currency);
        oldPaymentGateway.processPayment(amount);
    }
}

