package org.example.basepatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        SUV suv = new SUV();
        suv.engineVolume = 4.0;
        suv.seats = 5;
        suv.isCrossRoad = true;
        vehicles.add(suv);

        SUV anotherSUV = (SUV) suv.clone();
        vehicles.add(anotherSUV);

        CityCar cityCar = new CityCar();
        cityCar.engineVolume = 1.5;
        cityCar.seats = 6;
        cityCar.isComfortable = true;
        vehicles.add(cityCar);

        CityCar anotherCityCar = (CityCar) cityCar.clone();
        vehicles.add(anotherCityCar);

        cloneAndCompare(vehicles, vehiclesCopy);

    }

    private static void cloneAndCompare(List<Vehicle> vehicles, List<Vehicle> vehiclesCopy) {
        for (Vehicle vehicle : vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != vehiclesCopy.get(i)) {
                System.out.println(i + ": Vehicles are different objects");
                if (vehicles.get(i).equals(vehiclesCopy.get(i))) {
                    System.out.println(i + ": And they are identical");
                } else {
                    System.out.println(i + ": But they are not identical");
                }
            } else {
                System.out.println(i + ": Vehicle objects are the same");
            }

        }
    }
    /*
    Это паттерн, при котором происходит создание копии объекта за счет реализации метода копирования в самом объекте.
     */
}
