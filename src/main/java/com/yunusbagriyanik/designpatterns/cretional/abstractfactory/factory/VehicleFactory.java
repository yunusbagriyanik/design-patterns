package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if ("CAR".equalsIgnoreCase(type)) {
            return new Car();
        } else if ("TRUCK".equalsIgnoreCase(type)) {
            return new Truck();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
