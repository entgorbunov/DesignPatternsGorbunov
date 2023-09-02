package org.example.basepatterns.behavioral.visitor;

public class SoundVisitor implements Visitor{
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Meow!");
    }
    @Override
    public void visitDog(Dog dog) {
        System.out.println("Woof!");
    }
}
