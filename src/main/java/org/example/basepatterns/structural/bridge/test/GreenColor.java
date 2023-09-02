package org.example.basepatterns.structural.bridge.test;

public class GreenColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Красим в зеленый цвет");
    }
}
