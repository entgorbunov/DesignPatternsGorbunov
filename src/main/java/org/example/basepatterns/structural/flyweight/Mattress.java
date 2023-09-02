package org.example.basepatterns.structural.flyweight;

public class Mattress implements MattressInterface {
    String mattressSize;
    public String mattressFirmness;

    public Mattress(String mattressSize) {
        this.mattressSize = mattressSize;
    }

    public void setMattressFirmness(String mattressFirmness) {
        this.mattressFirmness = mattressFirmness;
    }

    @Override
    public void print() {
        System.out.println("\t\tThis is a " + mattressFirmness + " " + mattressSize + " mattress.");
    }
}
