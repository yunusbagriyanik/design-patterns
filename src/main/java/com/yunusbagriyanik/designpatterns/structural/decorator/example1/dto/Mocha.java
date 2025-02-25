package com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.BeverageDecorator;

public class Mocha extends BeverageDecorator {
    public Mocha(Beverage beverage) {
        super(beverage, "Mocha");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
