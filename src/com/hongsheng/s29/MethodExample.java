package com.hongsheng.s29;

public class MethodExample {

    // 普通方法
    public int normalMethod(int a, int b) {

        return a+b;
    }

    // 抽象方法
    public void abstractMethod() {

    }

    // 静态方法
    public static void staticMethod() {
        System.out.println("This is a static method");
    }

    // 默认方法
    public void defaultMethod() {
        System.out.println("This is a default method");
    }

    // 私有方法
    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        int result = example.normalMethod(1, 2);
        System.out.println("Result of normal method: " + result);

        MethodExample.staticMethod();

        example.defaultMethod();

        example.privateMethod();
    }
}

