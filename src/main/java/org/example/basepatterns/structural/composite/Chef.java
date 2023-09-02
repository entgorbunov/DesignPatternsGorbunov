package org.example.basepatterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Chef implements KitchenStaff {
    private String name;
    private String role;
    private List<KitchenStaff> staffList;

    Chef(String name, String role) {
        this.name = name;
        this.role = role;
        staffList = new ArrayList<KitchenStaff>();
    }

    public void add(Chef chef) {
        staffList.add(chef);
    }

    public void fire(Chef chef) {
        staffList.remove(chef);
    }

    @Override
    public String getDetails() {
        return (name + " is assigned the role of " + role);
    }

}
