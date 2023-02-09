package test2327;

import java.util.Scanner;

public class Arey {
    public static void main(String[] args) {
        Scanner uu = new Scanner(System.in);
        int i = uu.nextInt();
        int[] arr = new int[i];
        for(int a=0;a<i;a++){
            arr[a]=a;
        };
        for(int a=0;a<i;a++){
            System.out.println(arr[a]);
        };
    }
}

