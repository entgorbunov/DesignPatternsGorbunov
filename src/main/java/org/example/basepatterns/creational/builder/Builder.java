package org.example.basepatterns.creational.builder;

public interface Builder {
    void setApartmentType(ApartmentType apartmentType);

    void setFloorCovering(FloorCoveringType floorCovering);

    void setInterior(InteriorType interiorType);

    void setFloor(int floor);
}
