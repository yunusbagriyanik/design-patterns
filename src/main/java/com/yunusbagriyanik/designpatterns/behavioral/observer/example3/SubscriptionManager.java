package com.yunusbagriyanik.designpatterns.behavioral.observer.example3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubscriptionManager {
    private static final List<Subscription> subscriptions = new ArrayList<>();
    private final Set<String> notifiedUsers = new HashSet<>();

    public static void subscribe(User user, String coinName, double alertPrice) {
        subscriptions.add(new Subscription(user, coinName, alertPrice));
    }

    public void notifyUsers(String coinName, double price) {
        for (Subscription subscription : subscriptions) {
            String notificationKey = subscription.user().name() + "_" + coinName;

            // Check if the user's alert price is met and if notification was not already sent
            if (subscription.coinName().equals(coinName) && price >= subscription.alertPrice()
                    && !notifiedUsers.contains(notificationKey)) {

                System.out.println("🔔 Notification for " + subscription.user().name() + ": " +
                        coinName + " has reached the alert price of " + subscription.alertPrice());

                notifiedUsers.add(notificationKey);
            }
        }
    }

    public void resetNotifications() {
        notifiedUsers.clear();
    }
}
