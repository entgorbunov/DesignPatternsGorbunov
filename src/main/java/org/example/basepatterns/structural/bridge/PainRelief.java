package org.example.basepatterns.structural.bridge;

public class PainRelief implements Medicine {
    @Override
    public void administerMedication(int amount) {
        System.out.print(amount + " pain relief pills administered.");
    } }
