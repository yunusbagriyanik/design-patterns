package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Truck createTruck() {
        return new ElectricTruck();
    }
}
