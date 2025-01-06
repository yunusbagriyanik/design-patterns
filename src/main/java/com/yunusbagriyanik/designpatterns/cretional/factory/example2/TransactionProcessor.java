package com.yunusbagriyanik.designpatterns.cretional.factory.example2;

public interface TransactionProcessor {
    void process(String fromAddress, String toAddress, double amount);
}
