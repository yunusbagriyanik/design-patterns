package com.yunusbagriyanik.designpatterns.cretional.factory.example1;

public class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            throw new IllegalArgumentException("Channel can not be null or empty");

        return switch (channel) {
            case "SMS" -> new Sms();
            case "EMAIL" -> new Email();
            case "PUSH" -> new Push();
            default -> throw new IllegalArgumentException("Unsupported channel " + channel);
        };
    }
}
