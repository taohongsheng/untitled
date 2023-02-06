package test2326;
class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Dog extends animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        dog dog = new dog("Buddy", 5, "Labrador");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
    }
}
