package com.yunusbagriyanik.designpatterns.behavioral;

public class CreditCardPayment implements PaymentService {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " TL was made using credit card: " + cardNumber);
    }
}
