package org.example.basepatterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.print((int)iterator.next());
        }
    }
}
