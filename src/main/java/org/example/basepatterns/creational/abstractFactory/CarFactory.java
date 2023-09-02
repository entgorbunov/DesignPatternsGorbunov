package org.example.basepatterns.creational.abstractFactory;

public class CarFactory {
    public Car create(String type) {
        return switch (type) {
            case "Passenger Car" -> new PassengerCar();
            case "Off-Road Car" -> new OffRoadCar();
            default -> null;
        };
    }
}
