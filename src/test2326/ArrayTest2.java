package test2326;

import java.util.Scanner;
//动态创建
public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数组长度：");//确定数组长度
        int n = scan.nextInt();
        // int[] arr = {1, 2, 3, 4, 5};静态创建
        int[] arr = new int[n];//动态创建

        System.out.println("请输入数组元素：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("输入的数组元素为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
