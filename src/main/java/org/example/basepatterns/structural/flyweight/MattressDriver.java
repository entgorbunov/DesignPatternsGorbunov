package org.example.basepatterns.structural.flyweight;

public class MattressDriver {
    public static void main(String[] args) throws Exception {
        MattressFactory theFactory = new MattressFactory();
        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tMattress Manufacturing Factory Demo");
        System.out.println("======================================================");

        Mattress newMattress;
        for (int i = 0; i < 5; i++) {
            newMattress =
                    (Mattress) theFactory.getFactoryMattressess("Crib");
            newMattress.setMattressFirmness("Firm");
            newMattress.print();
        }
        for (int i = 0; i < 5; i++) {
            newMattress =
                    (Mattress) theFactory.getFactoryMattressess("Twin");
            newMattress.setMattressFirmness("Soft");
            newMattress.print();
        }
        for (int i = 0; i < 5; i++) {
            newMattress = (Mattress) theFactory.getFactoryMattressess("Full");
            newMattress.setMattressFirmness("Extra Firm");
            newMattress.print();

        }
    }
}
