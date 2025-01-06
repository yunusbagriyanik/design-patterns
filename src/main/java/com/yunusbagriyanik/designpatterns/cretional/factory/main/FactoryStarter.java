package com.yunusbagriyanik.designpatterns.cretional.factory.main;

import com.yunusbagriyanik.designpatterns.cretional.factory.example1.Notification;
import com.yunusbagriyanik.designpatterns.cretional.factory.example1.NotificationFactory;
import com.yunusbagriyanik.designpatterns.cretional.factory.example2.TransactionProcessor;
import com.yunusbagriyanik.designpatterns.cretional.factory.example2.TransactionProcessorFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryStarter {
    public static void main(String[] args) {
        log.info("Notification Factory");
        Notification sms = NotificationFactory.createNotification("SMS");
        sms.notifyUser();

        Notification email = NotificationFactory.createNotification("EMAIL");
        email.notifyUser();

        Notification push = NotificationFactory.createNotification("PUSH");
        push.notifyUser();

        log.info("Transaction Processor");
        TransactionProcessor bitcoinProcessor = TransactionProcessorFactory.getProcessor("Bitcoin");
        bitcoinProcessor.process("1A2B3C", "3C2B1A", 0.5);

        TransactionProcessor ethereumProcessor = TransactionProcessorFactory.getProcessor("Ethereum");
        ethereumProcessor.process("0x1234", "0x5678", 1.25);
    }
}