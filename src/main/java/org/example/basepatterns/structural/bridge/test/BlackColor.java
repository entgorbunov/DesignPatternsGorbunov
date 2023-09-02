package org.example.basepatterns.structural.bridge.test;

public class BlackColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Красим в черный цвет");
    }
}
