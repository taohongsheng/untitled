package test2326;

class ClassB {
    public void methodB() {
        System.out.println("This is methodB from ClassB");
    }
}

class ClassA extends ClassB {
    public void methodA() {
        System.out.println("This is methodA from ClassA");
    }
}

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}