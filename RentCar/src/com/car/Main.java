package com.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory carFactory = new CarFactory();
		List<Car> carList = new ArrayList<>();
		carList.add(carFactory.getCar("Coach"));
		carList.add(carFactory.getCar("Truck"));
		carList.add(carFactory.getCar("DoubleCar"));
		GetUserInputlmp input = new GetUserInputlmp();
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		do {
			System.out.println("租车回复1,退出回复2");
			scan = new Scanner(System.in);
			if (!scan.hasNextInt()) {
				userInput = 0;
			} else {
				userInput = scan.nextInt();
			}
		} while (userInput != 1 && userInput != 2);
		if (userInput == 1) {
			System.out.println("租车信息如下:");
			System.out.println("num" + '\t' + "name" + '\t' + "price($/d)" + '\t' + "people" + '\t' + '\t' + "load(t)");
			for (int i = 0; i < carList.size(); i++) {
				System.out.print(i);
				carList.get(i).print();
			}
			Car selectCar = carList.get(input.getLabelOfcar(carList.size()));
			int day = input.getDayOfCar();
			selectCar.pricepd = day * selectCar.pricepd;
			System.out.println("您的选择是：");
			System.out.println("天数" + '\t' + "name" + '\t' + "price($/d)" + '\t' + "people" + '\t' + '\t' + "load(t)");
			System.out.print(day);
			selectCar.print();
			scan.close();
		} else {
			scan.close();
			System.exit(0);
		}
	}

}
