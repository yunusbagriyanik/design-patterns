package com.yunusbagriyanik.designpatterns.behavioral.observer.example3.v2;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();
}
