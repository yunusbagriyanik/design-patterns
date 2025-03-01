package com.yunusbagriyanik.designpatterns.behavioral.observer.example1;

public class InvestmentCompany implements StockObserver {
    private final String name;

    public InvestmentCompany(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println(name + " - The lot value of " + stock.getName() + " stock has been updated to " + stock.getLotValue());
    }
}
