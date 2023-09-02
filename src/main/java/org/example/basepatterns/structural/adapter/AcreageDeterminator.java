package org.example.basepatterns.structural.adapter;

public class AcreageDeterminator {
    Lot lot;
    public double determineAcreage(Lot lot) {
        this.lot = lot;
        return lot.length * lot.width;
    }
}
