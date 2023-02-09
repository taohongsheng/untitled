package com.hongsheng.exercise;

import java.util.Scanner;

//奇偶判断
public class NiceNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if(a%2==0){
            System.out.println("偶数");
        }
        else System.out.println("奇数");

    }
}
