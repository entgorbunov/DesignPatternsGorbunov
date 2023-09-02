package org.example.basepatterns.behavioral.state;

public class ConcreteStateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии В");
        context.setState(new ConcreteStateA());
    }
}
