package org.example.basepatterns.creational.builder;

public class Director {
    public void createCommercialPremises(Builder builder) {
        builder.setApartmentType(ApartmentType.COMMERCIAL_PREMISES);
        builder.setFloor(1);
        builder.setFloorCovering(FloorCoveringType.TILE_COATING);
        builder.setInterior(InteriorType.COMMERCIAL_INTERIOR);
    }

    public void createResidentialPremises(Builder builder) {
        builder.setInterior(InteriorType.HOME_INTERIOR);
        builder.setFloorCovering(FloorCoveringType.CARPET_COATING);
        builder.setFloor(5);
        builder.setApartmentType(ApartmentType.RESIDENTIAL_PREMISES);
    }
}
