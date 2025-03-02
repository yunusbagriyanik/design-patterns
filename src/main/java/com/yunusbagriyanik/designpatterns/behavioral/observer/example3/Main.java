package com.yunusbagriyanik.designpatterns.behavioral.observer.example3;

public class Main {
    public static void main(String[] args) {
        CryptoAsset bitcoin = new CryptoAsset("Bitcoin", 50000);

        SubscriptionManager.subscribe(new User("Test User 1"), "Bitcoin", 51000);
        SubscriptionManager.subscribe(new User("Test User 2"), "Bitcoin", 52000);

        bitcoin.setPrice(50500);
        bitcoin.setPrice(51000);
        bitcoin.setPrice(52000);
    }
}
