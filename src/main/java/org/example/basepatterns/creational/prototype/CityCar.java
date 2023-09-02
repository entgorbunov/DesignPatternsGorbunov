package org.example.basepatterns.creational.prototype;

public class CityCar extends Vehicle{
    public boolean isComfortable;

    public CityCar() {
    }

    public CityCar(CityCar target) {
        super(target);
        if (target != null) {
            this.isComfortable = target.isComfortable;
        }
    }

    @Override
    public Vehicle clone() {
        return new CityCar(this);
    }
}
