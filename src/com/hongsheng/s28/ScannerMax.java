package com.hongsheng.s28;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入数组个数");
        int x = scn.nextInt();
        int[] arr = new int[x];
        for(int a=0;a<x ;a++){
            arr[a] = a;
        }
        for(int a=0;a<x ;a++){
            System.out.println(arr[a]);
        }

    }
}
