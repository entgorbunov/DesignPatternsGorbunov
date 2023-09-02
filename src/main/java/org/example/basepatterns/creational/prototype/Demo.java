package org.example.basepatterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        BundledVehicleCache cache = new BundledVehicleCache();
        Vehicle vehicle1 = cache.get("Big car with a frame");
        Vehicle vehicle2 = cache.get("Comfortable city car");
        Vehicle vehicle3 = cache.get("Comfortable city car");

        if (vehicle1 != vehicle2 && !vehicle1.equals(vehicle2)) {
            System.out.println("Big car with a frame != Comfortable city car");
        } else {
            System.out.println("Big car with a frame == Comfortable city car");
        }

        if (vehicle2 != vehicle3) {
            System.out.println("Comfortable city cars are two different objects");
            if (vehicle2.equals(vehicle3)) {
                System.out.println("And they are identical ");
            } else {
                System.out.println("But they are not identical");
            }
        } else {
            System.out.println("Comfortable city cars are the same");
        }
    }
}
