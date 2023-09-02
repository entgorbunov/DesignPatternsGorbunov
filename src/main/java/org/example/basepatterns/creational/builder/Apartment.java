package org.example.basepatterns.creational.builder;

import lombok.Getter;

@Getter
public class Apartment {
    private ApartmentType apartmentType;
    private FloorCoveringType floorCoveringType;
    private InteriorType interiorType;
    private int floor;

    public Apartment(ApartmentType apartmentType, FloorCoveringType floorCoveringType,
                     InteriorType interiorType, int floor) {
        this.apartmentType = apartmentType;
        this.floorCoveringType = floorCoveringType;
        this.interiorType = interiorType;
        this.floor = floor;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public void setFloorCoveringType(FloorCoveringType floorCoveringType) {
        this.floorCoveringType = floorCoveringType;
    }

    public void setInteriorType(InteriorType interiorType) {
        this.interiorType = interiorType;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ApartmentType apartmentType() {
        return apartmentType;
    }
}
