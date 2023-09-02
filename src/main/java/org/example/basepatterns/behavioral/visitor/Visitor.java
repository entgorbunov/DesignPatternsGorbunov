package org.example.basepatterns.behavioral.visitor;

public interface Visitor {
    void visitCat(Cat cat);

    void visitDog(Dog dog);
}
