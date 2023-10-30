package com.yunusbagriyanik.designpatterns.decorator.example1.main;

import com.yunusbagriyanik.designpatterns.decorator.example1.design.Beverage;
import com.yunusbagriyanik.designpatterns.decorator.example1.dto.DarkRoast;
import com.yunusbagriyanik.designpatterns.decorator.example1.dto.Espresso;
import com.yunusbagriyanik.designpatterns.decorator.example1.dto.HouseBlend;
import com.yunusbagriyanik.designpatterns.decorator.example1.dto.Mocha;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeverageDecoratorStarter {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.info(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        log.info(beverage2.getDescription() + " " + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        log.info(beverage3.getDescription() + " " + beverage3.cost());
    }
}
