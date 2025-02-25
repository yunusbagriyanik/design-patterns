package com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House Blend");
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
