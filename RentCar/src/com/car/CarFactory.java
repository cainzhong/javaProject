package com.car;

public class CarFactory {
	/**
	 * 工厂模式，根据需要的不同车型，返回不同的车
	 * 
	 * @param carType
	 * @return
	 */
	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equals("Coach")) {
			return new Coach(5, "人车", 12.5);
		} else if (carType.equals("Truck")) {
			return new Truck(2, "货车", 123.5);
		}
		if (carType.equals("DoubleCar")) {
			return new DoubleCar("两用车", 12.5, 123.5, 6);
		}
		return null;
	}
}
