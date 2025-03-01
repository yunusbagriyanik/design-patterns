package com.yunusbagriyanik.designpatterns.behavioral.observer.example1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Stock {
    private final String name;
    private double lotValue;
    private final List<StockObserver> stockObserverList = new ArrayList<>();

    public Stock(String name, double lotValue) {
        this.name = name;
        this.lotValue = lotValue;
    }

    public void subscribe(StockObserver stockObserver) {
        if (stockObserver != null && !stockObserverList.contains(stockObserver))
            stockObserverList.add(stockObserver);
    }

    public void unsubscribe(StockObserver stockObserver) {
        if (stockObserver != null && stockObserverList.contains(stockObserver))
            stockObserverList.remove(stockObserver);
        else
            System.out.println("Observer not found in the list.");
    }

    public void notifyObservers() {
        for (StockObserver stockObserver : stockObserverList)
            stockObserver.update(this);
    }

    public void setLotValue(double lotValue) {
        this.lotValue = lotValue;
        notifyObservers();
    }
}
