package com.imooc;
import java.util.Scanner;

import com.imooc.Coach;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        double price;
        int numOfPeople;
        double load;
        Car[] cars = {new Coach(12,"人车",12.3),new Truck(12.5,"货车",123.4),new DoubleCar("两用车",123.1,12.3,2)};
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.println("租车回复1,退出回复2");
            scan = new Scanner(System.in);
            if(!scan.hasNextInt()){
                userInput = 0;
            }else{
                userInput = scan.nextInt();
            }
        }while(userInput != 1 && userInput != 2);
        if (userInput == 1){
            System.out.println("租车信息如下:");
            System.out.println("num"+'\t'+"name"+'\t'+"price($/d)"+'\t'+"people"+'\t'+'\t'+"load(t)");
            int[] nums =  new int[cars.length];
            int[] lables = new int[cars.length];
            for(int i=0; i< cars.length;i++){
                name = cars[i].name;
                price = cars[i].pricepd;
                numOfPeople = cars[i].numOfPerson;
                load = cars[i].load;
                System.out.println(i +" "+'\t' + name +" "+ '\t' + price + " "+'\t' + numOfPeople + " "+'\t' +load);
                nums[i] = 0;
                lables[i] = cars.length;
            }
            GetUserInput userInput1 = new GetUserInputlmp();
            int i = 0;
            String isOver = "n";
            do {
                lables[i] = userInput1.getLabelOfcar(cars.length);
                nums[i] = userInput1.getDayOfCar();
                System.out.println("车型选择完毕请输入y");
                scan = new Scanner(System.in);
                isOver = scan.next();
                i++;
            }while(!isOver.equals("y"));
            System.out.println("num"+'\t'+"name"+'\t'+"price($)"+'\t'+"people"+'\t'+'\t'+"load(t)");
            for(i = 0; i<lables.length;i++){
                if(lables[i] != lables.length){
                    name = cars[lables[i]].name;
                    price = cars[lables[i]].pricepd;
                    numOfPeople = cars[lables[i]].numOfPerson;
                    load = cars[lables[i]].load;
                    System.out.println(nums[i] +" "+'\t' + name +" "+ '\t' + price*nums[i] + " "+'\t' + numOfPeople + " "+'\t' +load);
                }
            }
        }else if (userInput == 2){
            System.exit(0);
        }

    }






}
