package com.zuche;

import java.util.Scanner;
import com.zuche.com.cheliang.*;

/**
 * Date: 7/11/22
 *
 * @author hehao
 */
public class RentCarApp {
    public static void main(String[] args) {
        System.out.println("欢迎使用答答租车系统!");
        System.out.println("您是否需要租车？");
        System.out.println("1 是" + "    " + "0 否");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("可供选择的车辆如下：");
            System.out.println("序号" + "   " + "车名" + "    " + "日租金" + "   " + "容量");
            System.out.println("Num.1" + " " + "东方标致" + " " + "120元" + "   " + "载客量：5人");
            System.out.println("Num.2" + " " + "小货车" + "  " + "150元" + "   " + "载货量：5吨");
            System.out.println("Num.3" + " " + "奔驰" + "    " + "200元" + "   " + "载客量：6人");
            System.out.println("Num.4" + " " + "皮卡" + "    " + "180元" + "   " + "载货量：4吨 载客量：2人");
            System.out.println("Num.5" + " " + "大型货车" + " " + "220元" + "   " + "载货量：3吨");
            System.out.println("Num.6" + " " + "小型客车" + " " + "160元" + "   " + "载客量：9人");
        }
        System.out.println("请输入您需要的租车的数量：");
        int size = sc.nextInt(); int[] carNums = new int[size];
        for (int j = 0; j < size; j++) {
            System.out.println("请您选择您需要的车的编号：");
            carNums[j] = sc.nextInt();
            System.out.println();
        }
        System.out.println("请输入需要租车的天数：");
        int days = sc.nextInt();
        int totalPrice = 0;
        int totalSize = 0;
        for (int num : carNums) {
            BaseCar car = null;
            switch (num) {
            case 1:
                car = new BenzCar();
                break;
            case 2:
                car = new BigTruck();
                break;
            case 3:
                car = new Df();
                break;
            case 4:
                car = new Buggy();
                break;
            case 5:
                car = new PickUp();
                break;
            case 6:
                car = new Minibus();
                break;
            default:
                throw new IllegalArgumentException("illgeal car num");
            } totalPrice += car.getPrice() * days;
              totalSize +=car.getSize();
        }

        System.out.println("final price:" + totalPrice);
        System.out.println("fianl size:"+totalSize);

    }
}
