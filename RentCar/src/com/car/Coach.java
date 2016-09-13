package com.car;

public class Coach extends Car {
	
	
	Coach(int capability, String name, double pricepd) {
		this.numOfPerson = capability;
		this.name = name;
		this.pricepd = pricepd;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(
				'\t' + this.name + " " + '\t' + this.pricepd + " " + '\t' + this.numOfPerson + " " + '\t' + "0");
	}

}
