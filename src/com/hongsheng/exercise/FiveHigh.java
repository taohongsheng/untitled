package com.hongsheng.exercise;
//计算子女身高
public class FiveHigh {
    public static void main(String[] args) {
        double mother = 175;
        double father = 160;
        double sonheight = (mother+father)*1.08/2;
        double daughterheight = (father*0.923+mother)/2;
        System.out.println("儿子的身高是"+sonheight);
        System.out.println("女儿的身高是"+daughterheight);

    }
}
