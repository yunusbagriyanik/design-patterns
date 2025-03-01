package com.yunusbagriyanik.designpatterns.behavioral.observer.example1;

public class InvestmentCompanyObserverMain {
    public static void main(String[] args) {
        Stock testStock = new Stock("Test", 2.9);
        InvestmentCompany investmentCompany = new InvestmentCompany("Test Company");

        testStock.subscribe(investmentCompany);

        testStock.setLotValue(3.1);
        testStock.setLotValue(3.5);

        testStock.subscribe(investmentCompany);

        testStock.unsubscribe(investmentCompany);

        testStock.setLotValue(5);
        testStock.setLotValue(7);
    }
}
