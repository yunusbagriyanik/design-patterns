package com.yunusbagriyanik.designpatterns.behavioral.strategy;

public class PaymentContext {
    private PaymentService paymentStrategy;

    public void setPaymentStrategy(PaymentService paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
