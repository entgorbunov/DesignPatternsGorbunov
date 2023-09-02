package org.example.basepatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundledVehicleCache {
    private final Map<String, Vehicle> cache = new HashMap<>();

    public BundledVehicleCache() {
        SUV suv = new SUV();
        suv.isCrossRoad = true;
        suv.seats = 5;
        suv.engineVolume = 4.0;

        CityCar cityCar = new CityCar();
        cityCar.isComfortable = true;
        cityCar.seats = 6;
        cityCar.engineVolume = 1.5;

        cache.put("Off-Road car with a frame", suv);
        cache.put("Comfortable city car", cityCar);
    }

    public void put(String key, Vehicle vehicle) {
        cache.put(key, vehicle);
    }

    public Vehicle get(String key) {
        return cache.get(key).clone();
    }
}
