package com.yunusbagriyanik.designpatterns.structural.decorator.example1.design;

public abstract class BeverageDecorator extends Beverage {
    protected final Beverage beverage;

    public BeverageDecorator(Beverage beverage, String description) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    public abstract double cost();

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }
}
