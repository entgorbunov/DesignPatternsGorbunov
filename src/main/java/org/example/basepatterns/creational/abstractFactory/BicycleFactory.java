package org.example.basepatterns.creational.abstractFactory;

public class BicycleFactory {
    public Bicycle create(String type) {
        return switch (type) {
            case "Mountain Bike" -> new MountainBike();
            case "Road Bike" -> new RoadBike();
            default -> null;
        };

    }
}
