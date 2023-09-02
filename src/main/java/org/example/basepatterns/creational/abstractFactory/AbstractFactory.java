package org.example.basepatterns.creational.abstractFactory;

import java.util.Objects;

public class AbstractFactory implements Factory {
    @Override
    public Object createFactory(String type) {
        return switch (type) {
            case "Car Factory" -> new CarFactory();
            case "Bicycle Factory" -> new BicycleFactory();
            default -> null;
        };
    }
}
