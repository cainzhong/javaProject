package com.imooc;

/**
 * Created by husiqin on 16/9/6.
 */
public class DoubleCar extends Car{

    DoubleCar(String name, double pricepd,double capabilityT,int capabilityP){
        this.name = name;
        this.pricepd = pricepd;
        this.load = capabilityT;
        this.numOfPerson = capabilityP;
    }
}
