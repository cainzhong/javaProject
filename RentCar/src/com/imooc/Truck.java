package com.imooc;

/**
 * Created by husiqin on 16/9/6.
 */
public class Truck extends Car{
    Truck(double capability, String name,double pricepd){
        this.load = capability;
        this.name = name;
        this.pricepd = pricepd;
        this.numOfPerson = 0;
    }
}
