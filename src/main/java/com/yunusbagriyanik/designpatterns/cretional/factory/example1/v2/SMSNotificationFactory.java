package com.yunusbagriyanik.designpatterns.cretional.factory.example1.v2;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public NotificationV2 createNotification() {
        return new SmsNotification();
    }
}
