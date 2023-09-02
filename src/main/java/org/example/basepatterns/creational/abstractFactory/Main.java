package org.example.basepatterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        CarFactory carFactory = (CarFactory) abstractFactory.createFactory("Car Factory");
        BicycleFactory bicycleFactory = (BicycleFactory) abstractFactory.createFactory("Bicycle Factory");
        carFactory.create("Passenger Car").createCar();
        carFactory.create("Off-Road Car").createCar();
        bicycleFactory.create("Mountain Bike").createBicycle();
        bicycleFactory.create("Road Bike").createBicycle();

    }
}
/*
Создаёт семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов. Создается общая
абстрактная фабрика, которая может создавать любые объекты. Создается общий интерфейс для создания объектов, подклассы
реализуют его и вправе создавать разные типы объектов с помощью фабрики.
 */
