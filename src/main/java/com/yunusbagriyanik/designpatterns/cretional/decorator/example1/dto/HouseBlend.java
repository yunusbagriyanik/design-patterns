package com.yunusbagriyanik.designpatterns.cretional.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.cretional.decorator.example1.design.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
