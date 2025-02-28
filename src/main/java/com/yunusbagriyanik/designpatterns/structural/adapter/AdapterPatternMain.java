package com.yunusbagriyanik.designpatterns.structural.adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        PaymentGateway oldPaymentGateway0 = new OldPaymentGateway();
        oldPaymentGateway0.processPayment(50.0);

        PaymentProcessor newPaymentProcessor = new NewPaymentProcessor();
        newPaymentProcessor.process(100.0, "EUR");

        PaymentGateway oldPaymentGateway = new OldPaymentGateway();
        PaymentProcessor adapter = new PaymentGatewayAdapter(oldPaymentGateway);
        adapter.process(50.0, "USD");
    }
}
