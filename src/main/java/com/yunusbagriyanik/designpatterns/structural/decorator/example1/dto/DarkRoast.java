package com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
