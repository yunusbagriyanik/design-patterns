package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class ElectricTruck implements Truck {
    @Override
    public void assemble() {
        System.out.println("Electric Truck is assembled");
    }
}
