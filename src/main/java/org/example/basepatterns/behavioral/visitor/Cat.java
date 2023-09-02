package org.example.basepatterns.behavioral.visitor;

public class Cat implements Animal{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCat(this);
    }
}
