package com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
