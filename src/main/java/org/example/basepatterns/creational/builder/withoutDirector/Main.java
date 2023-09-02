package org.example.basepatterns.creational.builder.withoutDirector;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().
                topping1("Сыр").
                topping2("Томат").
                topping3("Колбаса").create();
        System.out.println(pizza.topping1);
        System.out.println(pizza.topping2);
        System.out.println(pizza.topping3);
        System.out.println("---------------------------");
        Pizza pizza2 = new Pizza.Builder().
                topping1("Сыр").
                topping2("Томат").
                topping3("Колбаса").create();
        System.out.println(pizza2.topping1);
        System.out.println(pizza2.topping2);
        System.out.println(pizza2.topping3);
    }
    /*
    Позволяет создавать сложные объекты пошагово. Использует один и тот же код для получения разных представлений объекта.
     */
}
