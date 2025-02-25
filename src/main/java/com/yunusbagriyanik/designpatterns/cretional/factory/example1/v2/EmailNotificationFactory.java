package com.yunusbagriyanik.designpatterns.cretional.factory.example1.v2;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationV2 createNotification() {
        return new EmailNotification();
    }
}
