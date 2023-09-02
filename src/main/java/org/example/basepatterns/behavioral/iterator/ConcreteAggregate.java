package org.example.basepatterns.behavioral.iterator;

public class ConcreteAggregate implements Aggregate {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Object next() {
            return numbers[index++];
        }
    }
}
