package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class ElectricCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Electric Car is assembled");
    }
}
