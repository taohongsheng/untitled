package com.hongsheng.s29;

public class Example {
    public void method1() throws Exception {
        throw new Exception("This is an exception thrown by method1");
    }
    public void method2() {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception in method2: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Example ex = new Example();
        ex.method2();
    }
}
