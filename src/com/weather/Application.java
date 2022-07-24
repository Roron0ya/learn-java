package com.weather;

import java.util.Scanner;

/**
 * Date: 7/5/22
 *
 * @author hehao
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("查询最近天气预报：");
        System.out.println("输入1：查询未来24小时天气预报");
        System.out.println("输入2：查询未来3天天气预报");
        System.out.println("输入3：查询未来天天气预报");
        System.out.print("请输入你的选择：");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        System.out.println("用户输入数字："+i);
        if(i==1){
            System.out.print("请输入城市名称查询未来24小时天气预报：");
            String city=scanner.next();
        }
    }
}
