package org.example.basepatterns.structural.composite.test;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoxContainer boxContainer1 = new BoxContainer(List.of(new PurchaseLeaf(100)));
        BoxContainer boxContainer2 = new BoxContainer(List.of(new PurchaseLeaf(300)));
        BoxContainer boxContainer3 = new BoxContainer(List.of(new PurchaseLeaf(400),
                boxContainer2));
        BoxContainer boxContainer4 = new BoxContainer(List.of(boxContainer1, boxContainer2,
                boxContainer3));
        System.out.println(boxContainer4.countPrice());


    }
}
