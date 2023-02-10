package com.hongsheng.exercise;

import java.util.Scanner;

public class ElevenBMI {
    public static void main(String[] args) {
        double high;
        double height;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高（m）");
        high = scan.nextDouble();
        System.out.println("请输入体重(kg)");
        height = scan.nextDouble();
        double bmi = height / (high * high);
        String r = "";

        //根据 bmi 指数范围，来给r重新赋值
        if (bmi < 18.5) {
            r = "过轻";
        } else if (bmi <= 22.9) {
            r = "正常";
        } else if (bmi <= 24.9) {
            r = "偏胖";
        } else if (bmi <= 29.9) {
            r = "肥胖";
        } else if (bmi <= 40) {
            r = "重度肥胖";
        } else {
            r = "极度肥胖";
        }
        //打印最终结果
        System.out.println("您的BMI指数：" + bmi);
        System.out.println("您的体重属于：" + r);


    }
}
