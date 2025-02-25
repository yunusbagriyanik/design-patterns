package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Car electricCar = electricFactory.createCar();
        Truck electricTruck = electricFactory.createTruck();
        electricCar.assemble();
        electricTruck.assemble();

        VehicleFactory gasolineFactory = new GasolineVehicleFactory();
        Car gasolineCar = gasolineFactory.createCar();
        Truck gasolineTruck = gasolineFactory.createTruck();
        gasolineCar.assemble();
        gasolineTruck.assemble();
    }
}
