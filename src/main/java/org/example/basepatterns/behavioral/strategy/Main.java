package org.example.basepatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 4, 9, 5, 0, 6, 7, 3, 0};
        ArraySorter arraySorter = new ArraySorter(new BubbleSort());
        arraySorter.sort(array);
        arraySorter.setSortingStrategy(new MergeSort());
        arraySorter.sort(array);
    }
}
