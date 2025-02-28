package com.yunusbagriyanik.designpatterns.structural.decorator.example1.main;

import com.yunusbagriyanik.designpatterns.structural.decorator.example1.design.Beverage;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto.Mocha;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto.DarkRoast;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto.Espresso;
import com.yunusbagriyanik.designpatterns.structural.decorator.example1.dto.HouseBlend;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeverageDecoratorStarter {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        log.info("{}: ${}", espresso.getDescription(), espresso.cost());

        Beverage houseBlendWithMocha = new Mocha(new HouseBlend());
        log.info("{}: ${}", houseBlendWithMocha.getDescription(), houseBlendWithMocha.cost());

        Beverage darkRoast = new DarkRoast();
        log.info("{}: ${}", darkRoast.getDescription(), darkRoast.cost());

        Beverage houseBlendWithDoubleMocha = new Mocha(new Mocha(new HouseBlend()));
        log.info("{}: ${}", houseBlendWithDoubleMocha.getDescription(), houseBlendWithDoubleMocha.cost());
    }
}
