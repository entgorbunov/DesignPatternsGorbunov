package org.example.basepatterns.creational.singleton.enumSingleton;

public enum MyEnumSingleton {
    INSTANCE;


    MyEnumSingleton() {
        System.out.println("Foo");
    }
}
