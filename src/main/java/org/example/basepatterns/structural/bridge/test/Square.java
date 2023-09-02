package org.example.basepatterns.structural.bridge.test;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Квадрат");
        color.fillColor();
    }
}
