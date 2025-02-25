package com.yunusbagriyanik.designpatterns.behavioral;

public class PaymentContext {
    private PaymentService paymentStrategy;

    public void setPaymentStrategy(PaymentService paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
