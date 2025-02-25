package com.yunusbagriyanik.designpatterns.cretional.factory.example1.v2;

public class FactoryMethod {
    public static void main(String[] args) {
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        NotificationV2 emailNotification = emailNotificationFactory.createNotification();
        emailNotification.sendNotification("email");
        NotificationFactory smsNotificationFactory = new SMSNotificationFactory();
        NotificationV2 smsNotification = smsNotificationFactory.createNotification();
        smsNotification.sendNotification("sms");
    }
}
