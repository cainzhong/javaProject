package com.imooc;

import java.util.Scanner;

/**
 * Created by husiqin on 16/9/7.
 */
public class GetUserInputlmp implements GetUserInput {
    public int getLabelOfcar(int MaxLabel){
        Scanner scan = new Scanner(System.in);
        int userInput = MaxLabel;
        do {
            System.out.println("请输入您所需车的序号:");
            scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                userInput = scan.nextInt();
            }
        }while(userInput >= MaxLabel);
        return userInput;
    }
    public int getDayOfCar(){

        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        do {
            System.out.println("请输入租车天数:");
            scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                userInput = scan.nextInt();
            }
        }while(userInput <= 0);
        return userInput;
    }
}
