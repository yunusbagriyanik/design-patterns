package com.yunusbagriyanik.designpatterns.decorator.example1.design;

public abstract class Beverage {
    public String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
