package org.example.basepatterns.structural.facade.MealComponents;

public class MealProtein {
    private String protein;

    public void setProtein(String protein) {
        this.protein = protein;
        System.out.println("\t\tProtein (" + this.protein + ") added to meal.");
    }

}

