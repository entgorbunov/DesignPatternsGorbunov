package org.example.basepatterns.structural.facade.MealFacade;

import org.example.basepatterns.structural.facade.MealComponents.MealProtein;
import org.example.basepatterns.structural.facade.MealComponents.MealStarch;
import org.example.basepatterns.structural.facade.MealComponents.MealVegetable;

public class MealFacade {
    MealProtein newProtein;
    MealVegetable newVegetable;
    MealStarch newStarch;

    public MealFacade() {
        newProtein = new MealProtein();
        newVegetable = new MealVegetable();
        newStarch = new MealStarch();
    }

    public void assembleMeal(String protein, String vegetable, String starch) {
        System.out.println("\n\tMeal assembly process initiated. . .");
        newProtein.setProtein(protein);
        newVegetable.setVegetable(vegetable);
        newStarch.setStarch(starch);
        System.out.println("\tMeal assembly process completed. . .");
    }
}
