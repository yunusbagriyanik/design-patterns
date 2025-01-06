package com.yunusbagriyanik.designpatterns.cretional.decorator.example1.dto;

import com.yunusbagriyanik.designpatterns.cretional.decorator.example1.design.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
