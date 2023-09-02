package org.example.basepatterns.creational.singleton.doubleCheckedLockingAndVolatile;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                If you see the same value, then singleton was reused
                If you see different values, then two singletons were created

                RESULT:
                """);
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        });
        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        });
        thread1.start();
        thread2.start();
    }
/*
+ Ленивая инициализация
+ Высокая производительность
— Поддерживается только с JDK 1.5 [5]
 */
}
