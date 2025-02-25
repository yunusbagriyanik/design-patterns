package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class GasolineVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new GasolineCar();
    }

    @Override
    public Truck createTruck() {
        return new GasolineTruck();
    }
}
