package com.yunusbagriyanik.designpatterns.cretional.abstractfactory.context;

public class GasolineCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Gasoline Car is assembled");
    }
}
