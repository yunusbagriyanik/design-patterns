package com.yunusbagriyanik.designpatterns.cretional.factory.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BitcoinTransactionProcessor implements TransactionProcessor {
    @Override
    public void process(String fromAddress, String toAddress, double amount) {
        log.info("Processing Bitcoin transaction...");
        log.info("From: " + fromAddress);
        log.info("To: " + toAddress);
        log.info("Amount: " + amount + " BTC");
    }
}