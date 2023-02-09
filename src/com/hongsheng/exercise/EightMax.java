package com.hongsheng.exercise;import java.util.Scanner;
//最大数
public class EightMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float max ;
        max = a>b ? a : b;
        max = max>c ? max : c;
        System.out.println(max);
        /* 判断中当第一个是大于，第二个就是小于等于，别多加条件 */

    }
}
