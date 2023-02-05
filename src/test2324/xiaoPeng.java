package test2324;


import java.util.Scanner;

public class xiaoPeng {
    public static void main(String[] args) {
        String reward;
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        System.out.println(grade);
        if(grade == 100){
            reward = "宝马";
        }
        else if(grade>=90&&grade<100){
            reward = "苹果手机";
        }
        else if(grade>=80&&grade<90){
            reward = "苹果";}
        else
            reward = "屁都没有";
        System.out.print("这个成绩他可以得到"+reward);

    }
}
