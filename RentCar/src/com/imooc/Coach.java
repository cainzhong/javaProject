package com.imooc;

/**
 * Created by husiqin on 16/9/6.
 */
public class Coach extends Car{

    Coach(int capability, String name,double pricepd){
        this.numOfPerson = capability;
        this.name = name;
        this.pricepd = pricepd;
        this.load = 0;
    }
}
