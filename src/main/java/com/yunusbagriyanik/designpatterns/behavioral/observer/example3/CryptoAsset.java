package com.yunusbagriyanik.designpatterns.behavioral.observer.example3;

public class CryptoAsset {
    private final String name;
    private double price;

    public CryptoAsset(String name, double initialPrice) {
        this.name = name;
        this.price = initialPrice;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("📈 " + name + " new price: " + newPrice);
        EventDispatcher.publish(newPrice, name);
    }
}
