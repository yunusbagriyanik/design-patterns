package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.factory;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}
