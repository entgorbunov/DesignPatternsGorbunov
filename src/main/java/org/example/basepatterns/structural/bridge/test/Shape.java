package org.example.basepatterns.structural.bridge.test;

public abstract class Shape {
    public Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
