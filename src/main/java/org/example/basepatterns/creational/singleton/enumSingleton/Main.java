package org.example.basepatterns.creational.singleton.enumSingleton;

import org.example.basepatterns.creational.singleton.doubleCheckedLockingAndVolatile.Singleton;

public class Main {
    public static void main(String[] args) {

            System.out.println("""
                If you see the same value, then singleton was reused
                If you see different values, then two singletons were created

                RESULT:
                """);
            Thread thread1 = new Thread(() -> {
                MyEnumSingleton singleton = MyEnumSingleton.INSTANCE;
                System.out.println(singleton);
            });
            Thread thread2 = new Thread(() -> {
                MyEnumSingleton singleton = MyEnumSingleton.INSTANCE;
                System.out.println(singleton);
            });
            thread1.start();
            thread2.start();

    }
    /*
    + Сериализация из коробки
    + Потокобезопасность из коробки
    + Возможность использования EnumSet, EnumMap и т.д.
    + Поддержка switch
    - Неленивая инициализация.
     */
}
