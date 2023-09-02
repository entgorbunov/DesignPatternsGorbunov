package org.example.basepatterns.creational.prototype.test;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Dodge");
        car.setColor("Red");

        Car car1 = car.clone();
        System.out.println(car);
        System.out.println("------------------");
        System.out.println(car1);
    }
}
