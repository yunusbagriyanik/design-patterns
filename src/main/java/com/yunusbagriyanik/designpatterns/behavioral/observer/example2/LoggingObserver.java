package com.yunusbagriyanik.designpatterns.behavioral.observer.example2;

public class LoggingObserver implements FileChangeObserver {
    private final String logFile;
    private final String message;

    public LoggingObserver(String logFile, String message) {
        this.logFile = logFile;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        String formattedMessage = String.format(message, filename);
        System.out.println("[LOG] " + formattedMessage + " (Log File: " + logFile + ")");
    }
}
