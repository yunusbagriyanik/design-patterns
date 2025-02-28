package com.yunusbagriyanik.designpatterns.structural.adapter;

public class NewPaymentProcessor implements PaymentProcessor {
    @Override
    public void process(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " using new processor.");
    }
}
