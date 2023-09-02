package org.example.basepatterns.behavioral.visitor;

public class SwimmingVisitor implements Visitor{
    @Override
    public void visitCat(Cat cat) {
        System.out.println("Swimming with the cat!");
    }

    @Override
    public void visitDog(Dog dog) {
        System.out.println("Swimming with the dog!");
    }
}
