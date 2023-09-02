package org.example.basepatterns.creational.prototype;

public class SUV extends Vehicle {
    public boolean isCrossRoad;

    public SUV() {
    }

    public SUV(SUV target) {
        super(target);
        if (target != null) {
            this.isCrossRoad = target.isCrossRoad;
        }
    }

    @Override
    public Vehicle clone() {
        return new SUV(this);
    }
}
