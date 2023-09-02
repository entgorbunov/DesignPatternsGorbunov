package org.example.basepatterns.creational.prototype.test;

import lombok.Getter;

@Getter
public class Car {
    private String color;
    private String name;

    public Car clone() {
        Car car = new Car();
        car.color = color;
        car.name = name;
        return car;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
