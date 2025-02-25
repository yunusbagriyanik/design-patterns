package com.yunusbagriyanik.designpatterns.cretional.factory.example1.v2;

public class SmsNotification implements NotificationV2 {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sms Notification: " + message);
    }
}
