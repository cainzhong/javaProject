package com.car;

/**
 * Created by husiqin on 16/9/6.
 */
public class Truck extends Car {
	Truck(double capability, String name, double pricepd) {
		this.load = capability;
		this.name = name;
		this.pricepd = pricepd;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println('\t' + this.name + " " + '\t' + this.pricepd + " " + '\t' + "0" + " " + '\t' + this.load);
	}
}
