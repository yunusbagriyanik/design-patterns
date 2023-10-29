package com.yunusbagriyanik.designpatterns.factory.main;

import com.yunusbagriyanik.designpatterns.factory.NotificationFactory;

public class FactoryStarter {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.createNotification("SMS").notifyUser();
        notificationFactory.createNotification("EMAIL").notifyUser();
        notificationFactory.createNotification("PUSH").notifyUser();
    }
}
