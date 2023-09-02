package org.example.basepatterns.structural.facade.MealFacade;

public class FacadeDriver {
    public static void main(String[] args) {


        MealFacade meal1 = new MealFacade();
        meal1.assembleMeal("Steak", "Asparagus", "Wild Rice");
        MealFacade meal2 = new MealFacade();
        meal2.assembleMeal("Chicken", "Green Beans", "Potato Wedges");
        MealFacade meal3 = new MealFacade();
        meal3.assembleMeal("Meatloaf", "Brussels Sprouts", "Mashed Potatoes");

    }
    /*
    Это структурный паттерн, который предоставляет простой (но урезанный) интерфейс к сложной системе классов, библиотеке
    или фреймворку.
     */
}
