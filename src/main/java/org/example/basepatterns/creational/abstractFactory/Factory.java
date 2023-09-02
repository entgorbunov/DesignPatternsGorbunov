package org.example.basepatterns.creational.abstractFactory;

public interface Factory<T> {
    T createFactory(String type);
}
