package org.example.basepatterns.creational.singleton.synchronizedSingleton;

public class MySynchronizedSingleton {
    private static MySynchronizedSingleton instance;

    public static synchronized MySynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new MySynchronizedSingleton();
        }
        return instance;
    }
    /*
    + Ленивая инициализация
    — Низкая производительность (критическая секция) в наиболее типичном доступе
     */
}
