package com.yunusbagriyanik.designpatterns.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.decorator.example1.design.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
