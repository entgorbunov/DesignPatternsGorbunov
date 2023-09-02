package org.example.basepatterns.structural.adapter;

import java.text.DecimalFormat;

public class AdapterDriver {


    public static void main(String[] args) {
        System.out.println("\n\nReal Estate Land Area Calculation");
        AcreageDeterminatorAdapter adAdapter = new
                AcreageDeterminatorAdapter();
        Estate estate = new Estate(300, 300);
        double square = adAdapter.determineAcreage(estate);
        System.out.print("Estate Acreage: ");
        System.out.print(square);
    }

    /*
    Это структурный паттерн, который позволяет объектам с несовместимыми интерфейсами работать вместе.
     */
}
