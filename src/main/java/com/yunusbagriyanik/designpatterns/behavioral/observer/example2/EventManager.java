package com.yunusbagriyanik.designpatterns.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<String, List<FileChangeObserver>> listeners = new HashMap<>();

    public EventManager(String... eventTypes) {
        for (String eventType : eventTypes) {
            listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, FileChangeObserver listener) {
        listeners.get(eventType).add(listener);
    }

    public void notify(String eventType, String data) {
        for (FileChangeObserver listener : listeners.get(eventType)) {
            listener.update(data);
        }
    }
}
