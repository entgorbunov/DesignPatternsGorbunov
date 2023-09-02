package org.example.basepatterns.creational.singleton.doubleCheckedLockingAndVolatile;

public class Singleton {
    private volatile static Singleton INSTANCE;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton(value);
                }
            }
        }
        return INSTANCE;
    }

}
