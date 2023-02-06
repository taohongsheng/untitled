package test2326;

class animal {
    private String name;
    private int age;
    public animal(String name, int age) {
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

class dog extends animal {
    private String breed;
    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}

public class t {
    public static void main(String[] args) {
        dog dog = new dog("Buddy", 5, "Labrador");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());
    }
}
