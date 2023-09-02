package org.example.basepatterns.creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Gift kidsGift = new GiftFactory().createGift(8);
        Gift matureGift = new GiftFactory().createGift(22);
        System.out.println(kidsGift.getName());
        System.out.println(matureGift.getName());
    }
}

/*
 Решает проблему создания объектов разного типа одним методом, возвращаемый метод зависит от логики, описанной в этом
 методе. Создается общий интерфейс для создания объектов, подклассы реализуют его и вправе создавать разные
 типы объектов с помощью фабрики.
*/
