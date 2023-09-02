    package org.example.basepatterns.creational.abstractFactory;

    public class RoadBike implements Bicycle{
        @Override
        public void createBicycle() {
            System.out.println("Шоссейный велосипед");
        }
    }
