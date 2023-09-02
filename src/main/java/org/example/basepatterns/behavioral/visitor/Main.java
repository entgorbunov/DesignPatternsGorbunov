package org.example.basepatterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Visitor soundVisitor = new SoundVisitor();
        Visitor actionVisitor = new ActionVisitor();
        Visitor swimmingVisitor = new SwimmingVisitor();

        cat.accept(soundVisitor);
        cat.accept(actionVisitor);
        dog.accept(soundVisitor);
        dog.accept(actionVisitor);
        cat.accept(swimmingVisitor);
        dog.accept(swimmingVisitor);
    }
}
