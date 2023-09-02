package org.example.basepatterns.structural.bridge.test;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new RedColor());
        triangle.draw();

    }
}
