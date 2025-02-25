package com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.BeverageDecorator;

public class Mocha extends BeverageDecorator {
    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
