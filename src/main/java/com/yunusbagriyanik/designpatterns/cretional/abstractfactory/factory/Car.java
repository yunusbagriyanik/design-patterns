package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.factory;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}
