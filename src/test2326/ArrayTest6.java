package test2326;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数组个数");
        int i = scan.nextInt();
        int[] nums = new int[i];
        for (int a = 0; a < i; a++) {
            nums[a] = a;
        }
        for (int a = 0; a < i; a++) {
            System.out.println(nums[a]);
        }
    }
}
