package org.example.basepatterns.creational.prototype;

import java.util.Objects;

public abstract class Vehicle {
    public double engineVolume;
    public int seats;


    public Vehicle() {
    }

    public Vehicle(Vehicle target) {
        if (target != null) {
            this.engineVolume = target.engineVolume;
            this.seats = target.seats;
        }
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return engineVolume == vehicle.engineVolume && seats == vehicle.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVolume, seats);
    }
}
