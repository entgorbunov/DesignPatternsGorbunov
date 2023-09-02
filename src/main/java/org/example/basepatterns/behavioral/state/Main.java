package org.example.basepatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        State stateA = new ConcreteStateA();
        Context context = new Context(stateA);
        context.doAction();
        context.doAction();

    }
}
