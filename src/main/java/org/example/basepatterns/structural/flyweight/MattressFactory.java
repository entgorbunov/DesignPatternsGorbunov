package org.example.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MattressFactory {
    Map<String, MattressInterface> sizes = new HashMap<>();

    public int numberOfMatresses() {
        return sizes.size();
    }

    public MattressInterface getFactoryMattressess(String mSize) throws Exception {
        MattressInterface mattressSize;
        if (sizes.containsKey(mSize)) {
            mattressSize = sizes.get(mSize);
        } else {
            switch (mSize) {
                case "Crib" -> {
                    System.out.println("\tA Crib Mattress did not exist, but does now");
                    mattressSize = new Mattress("Crib");
                    sizes.put("Crib", mattressSize);
                }
                case "Twin" -> {
                    System.out.println("\tA Twin Mattress did not exist, but does now");
                    mattressSize = new Mattress("Twin");
                    sizes.put("Twin", mattressSize);
                }
                case "Full" -> {
                    System.out.println("\tA Full Mattress did not exist, but does now");
                    mattressSize = new Mattress("Full");
                    sizes.put("Full", mattressSize);
                }
                default -> throw new Exception("\tMattress Creation Request Error: " +
                        "invalid mattress size defined.");
            }
        }
        return mattressSize;
    }
}
