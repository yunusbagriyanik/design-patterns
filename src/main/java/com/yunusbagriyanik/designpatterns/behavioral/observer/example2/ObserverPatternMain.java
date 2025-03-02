package com.yunusbagriyanik.designpatterns.behavioral.observer.example2;

public class ObserverPatternMain {
    public static void main(String[] args) {
        FileEditor fileEditor = new FileEditor();

        LoggingObserver logger = new LoggingObserver("/path/to/log.txt", "File Opened: %s");
        fileEditor.eventManager.subscribe("open", logger);

        EmailNotificationObserver emailAlerts = new EmailNotificationObserver("admin@example.com", "File Saved: %s");
        fileEditor.eventManager.subscribe("save", emailAlerts);

        fileEditor.openFile("example.txt");
        fileEditor.saveFile();
    }
}
