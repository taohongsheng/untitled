package test2327;

public class dongwu {
    String names;
    String color;
    int year;
    int nums;
    dongwu(String names,String color,int year,int nums) {
        this.names=names;
        this.color=color;
        this.year=year;
        this.nums=nums;}
        void guss(){
            System.out.println(names+color+year+nums);
        }
public static class main{
    public static void main(String[] args) {
        dongwu sheep =new dongwu("dingding ","saaa",14,123);
        sheep.guss();
    }
}

    }
