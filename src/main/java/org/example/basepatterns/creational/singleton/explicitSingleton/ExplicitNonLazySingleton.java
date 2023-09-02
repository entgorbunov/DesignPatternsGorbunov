package org.example.basepatterns.creational.singleton.explicitSingleton;

public class ExplicitNonLazySingleton {
    public static final ExplicitNonLazySingleton singleton = new ExplicitNonLazySingleton();
}

/*
+ Простая и прозрачная реализация
+ Потокобезопасность
— Не ленивая инициализация
 */
