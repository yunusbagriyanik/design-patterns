package com.yunusbagriyanik.designpatterns.behavioral.observer.example3;

public class EventDispatcher {
    private static final SubscriptionManager subscriptionManager = new SubscriptionManager();

    public static void publish(double price, String coinName) {
        System.out.println("📡 Event published: " + coinName + " price updated to " + price);
        subscriptionManager.notifyUsers(coinName, price);
    }
}
