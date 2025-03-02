package com.yunusbagriyanik.designpatterns.behavioral.observer.example3.v2;

public class CryptoAsset implements Subject {
    private final String name;
    private double price;
    private final EventDispatcher eventDispatcher;

    public CryptoAsset(String name, double initialPrice, EventDispatcher eventDispatcher) {
        this.name = name;
        this.price = initialPrice;
        this.eventDispatcher = eventDispatcher;
    }

    @Override
    public void subscribe(Observer observer) {
        eventDispatcher.addObserver(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        eventDispatcher.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        eventDispatcher.dispatchEvent(name, price);
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("📈 " + name + " new price: " + newPrice);
        notifyObservers();
    }
}
