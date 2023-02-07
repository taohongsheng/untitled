package test2327;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

public class r {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        person.showInfo();
    }
}

