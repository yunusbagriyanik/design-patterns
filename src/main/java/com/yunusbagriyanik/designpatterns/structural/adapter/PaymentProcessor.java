package com.yunusbagriyanik.designpatterns.structural.adapter;

public interface PaymentProcessor {
    void process(double amount, String currency);
}
