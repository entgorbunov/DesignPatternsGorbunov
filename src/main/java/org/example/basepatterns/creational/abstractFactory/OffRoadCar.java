package org.example.basepatterns.creational.abstractFactory;

public class OffRoadCar implements Car {
    @Override
    public void createCar() {
        System.out.println("Внедорожник");
    }
}
