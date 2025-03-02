package com.yunusbagriyanik.designpatterns.behavioral.observer.example2;

public class EmailNotificationObserver implements FileChangeObserver {
    private final String email;
    private final String message;

    public EmailNotificationObserver(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String formattedMessage = String.format(message, filename);
        System.out.println("[EMAIL] Notification sent to " + email + " with message: " + formattedMessage);
    }
}
