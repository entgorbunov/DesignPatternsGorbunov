package org.example.basepatterns.creational.abstractFactory;

public class PassengerCar implements Car {

    @Override
    public void createCar() {
        System.out.println("Легковушка");
    }
}
