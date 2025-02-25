package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class GasolineTruck implements Truck {
    @Override
    public void assemble() {
        System.out.println("Gasoline Truck is assembled");
    }
}
