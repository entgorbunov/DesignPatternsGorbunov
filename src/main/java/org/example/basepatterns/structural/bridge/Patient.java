package org.example.basepatterns.structural.bridge;

abstract class Patient {
    protected Medicine medicine;

    protected Patient(Medicine med) {
        this.medicine = med;
    }

    abstract void selectPatient(int dose);

    abstract void modifyMedication(int dose, int increment);
}

