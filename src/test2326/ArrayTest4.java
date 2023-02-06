package test2326;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int arr = scan.nextInt();
        int[] arry = new int[arr];
        for (int a=0;a<arr;a++){
            arry[a]=scan.nextInt();
        }
        for(int a=0;a<arr;a++){
            System.out.println(arry[a]);
        }
        }
    }
