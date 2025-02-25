package com.yunusbagriyanik.designpatterns.structural.decorator.example1.design;

import lombok.Getter;

@Getter
public abstract class Beverage {
    protected final String description;

    public abstract double cost();

    protected Beverage(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getDescription() + ": $" + cost();
    }
}
