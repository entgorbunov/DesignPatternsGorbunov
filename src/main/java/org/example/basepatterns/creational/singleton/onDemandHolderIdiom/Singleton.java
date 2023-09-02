package org.example.basepatterns.creational.singleton.onDemandHolderIdiom;

public class Singleton {
    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    /*
    + Ленивая инициализация
    + Высокая производительность
    — Невозможно использовать для нестатических полей класса.
     */
}
