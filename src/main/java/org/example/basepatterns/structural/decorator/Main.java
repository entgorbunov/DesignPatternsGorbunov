package org.example.basepatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Cappuccino(new Sugar(new Milk(new PlainBeverage())));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription() );
    }
    /*
    позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные обертки.
     */
}
