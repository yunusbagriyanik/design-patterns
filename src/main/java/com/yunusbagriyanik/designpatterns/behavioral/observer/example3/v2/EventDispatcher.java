package com.yunusbagriyanik.designpatterns.behavioral.observer.example3.v2;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void dispatchEvent(String coinName, double price) {
        for (Observer observer : observers)
            observer.update(coinName, price);
    }
}
