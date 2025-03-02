package com.yunusbagriyanik.designpatterns.behavioral.observer.example3.v2;

public class Main {
    public static void main(String[] args) {
        EventDispatcher eventDispatcher = new EventDispatcher();
        CryptoAsset bitcoin = new CryptoAsset("Bitcoin", 25000.0, eventDispatcher);
        CryptoAsset ethereum = new CryptoAsset("Ethereum", 1700.0, eventDispatcher);

        User user1 = new User("Test User 1", "Bitcoin", 26000.0);
        User user2 = new User("Test User 2", "Ethereum", 1800.0);
        User user3 = new User("Test User 3", "Bitcoin", 20000.0);

        bitcoin.subscribe(user1);
        bitcoin.subscribe(user3);
        ethereum.subscribe(user2);

        System.out.println("Price is updating: Bitcoin 27,000.0");
        bitcoin.setPrice(27000.0);

        System.out.println("\nPrice is updating: Ethereum 1900.0");
        ethereum.setPrice(1900.0);

        System.out.println("\nPrice is updating: Bitcoin 25,000.0");
        bitcoin.setPrice(25000.0);
    }
}
