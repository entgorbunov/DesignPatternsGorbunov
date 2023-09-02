package org.example.basepatterns.creational.abstractFactory;

public class MountainBike implements Bicycle{
    @Override
    public void createBicycle() {
        System.out.println("Горный велосипед");
    }
}
