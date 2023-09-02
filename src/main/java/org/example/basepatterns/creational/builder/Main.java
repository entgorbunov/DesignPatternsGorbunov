package org.example.basepatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();
        director.createCommercialPremises(apartmentBuilder);
        var commercialApartmentBuilderResult = apartmentBuilder.getResult();
        System.out.println("Apartment built:\n" + commercialApartmentBuilderResult.apartmentType());
        director.createResidentialPremises(apartmentBuilder);
        var residentialApartmentBuilderResult = apartmentBuilder.getResult();
        System.out.println("Apartment built:\n" + residentialApartmentBuilderResult.apartmentType());
    }
    /*
    Позволяет создавать сложные объекты пошагово. Использует один и тот же код для получения разных представлений объекта.
     */
}
