package org.example.basepatterns.structural.adapter;

public class AcreageDeterminatorAdapter {
    AcreageDeterminator determinator;
    Estate estate;
    public double determineAcreage(Estate estate) {
        determinator = new AcreageDeterminator();
        this.estate = estate;
        Lot lot = new Lot();
        lot.length = this.estate.length;
        lot.width = this.estate.width;
        return (determinator.determineAcreage(lot));
    }
}
