package com.yunusbagriyanik.designpatterns.behavioral.observer.example3.v2;

public class User implements Observer {
    private final String name;
    private final String coinName;
    private final double alertPrice;

    public User(String name, String coinName, double alertPrice) {
        this.name = name;
        this.coinName = coinName;
        this.alertPrice = alertPrice;
    }

    @Override
    public void update(String coinName, double price) {
        if (this.coinName.equals(coinName) && price >= alertPrice) {
            System.out.println("🔔 " + name + ": " + coinName + " has reached your alert price of " + alertPrice);
        }
    }
}
