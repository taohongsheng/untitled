package test2326;

class Car {
    String brand;
    String model;
    int year;

    // 构造器
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 方法
    public void displayInformation() {
        System.out.println("品牌：" + brand);
        System.out.println("型号：" + model);
        System.out.println("年份：" + year);
    }
}

public class gouzao {
    public static void main(String[] args) {
        Car car1 = new Car("丰田", "凯美瑞", 2020);
        Car car2 = new Car("本田", "雅阁", 2019);

        System.out.println("汽车1的信息：");
        car1.displayInformation();

        System.out.println("汽车2的信息：");
        car2.displayInformation();
    }
}

