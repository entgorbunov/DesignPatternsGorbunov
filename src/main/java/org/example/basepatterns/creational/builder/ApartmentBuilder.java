package org.example.basepatterns.creational.builder;

public class ApartmentBuilder implements Builder {
    private ApartmentType apartmentType;
    private FloorCoveringType floorCoveringType;
    private InteriorType interiorType;
    private int floor;

    @Override
    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    @Override
    public void setFloorCovering(FloorCoveringType floorCovering) {
        this.floorCoveringType = floorCovering;
    }

    @Override
    public void setInterior(InteriorType interiorType) {
        this.interiorType = interiorType;
    }

    @Override
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Apartment getResult() {
        return new Apartment(apartmentType, floorCoveringType,
                interiorType, floor);
    }
}
