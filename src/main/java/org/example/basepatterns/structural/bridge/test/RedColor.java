package org.example.basepatterns.structural.bridge.test;

public class RedColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Красим в красный цвет");
    }
}
