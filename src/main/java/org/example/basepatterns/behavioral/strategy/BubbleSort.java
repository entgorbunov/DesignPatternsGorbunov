package org.example.basepatterns.behavioral.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Реализация сортировки пузырьком");
    }
}
