package com.hongsheng.exercise;

import java.util.Scanner;

//星期
public class TenWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1——7的数字");
        int week = scan.nextInt();
        switch (week){
            case 1:
                System.out.println("星期一");
                break;case 2:
                System.out.println("星期二");
                break;case 3:
                System.out.println("星期三");
                break;case 4:
                System.out.println("星期四");
                break;case 5:
                System.out.println("星期五");
                break;case 6:
                System.out.println("星期六");
                break;case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("未知数");
        }
    }
}
