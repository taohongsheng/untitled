package test2327;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("SUV", 2022);
        myCar.startEngine();
        myCar.stopEngine();
    }
}
