package com.yunusbagriyanik.designpatterns.behavioral.observer.example2;

public class FileEditor {
    protected final EventManager eventManager;
    private String filePath;

    public FileEditor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String path) {
        this.filePath = path;
        eventManager.notify("open", filePath);
    }

    public void saveFile() {
        eventManager.notify("save", filePath);
    }
}
