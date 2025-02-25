package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("CAR");
        car.drive();

        Vehicle truck = VehicleFactory.createVehicle("TRUCK");
        truck.drive();
    }
}
