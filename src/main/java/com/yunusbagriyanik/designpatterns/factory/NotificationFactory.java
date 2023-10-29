package com.yunusbagriyanik.designpatterns.factory;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            throw new IllegalArgumentException("Channel can not be null or empty");

        return switch (channel) {
            case "SMS" -> new Sms();
            case "EMAIL" -> new Email();
            case "PUSH" -> new Push();
            default -> null;
        };
    }
}
