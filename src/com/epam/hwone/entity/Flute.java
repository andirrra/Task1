package com.epam.hwone.entity;

public class Flute extends Wind {
    private String wayOfHolding;

    public String getWayOfHolding() {
        return wayOfHolding;
    }

    public void setWayOfHolding(String wayOfHolding) {
        this.wayOfHolding = wayOfHolding;
    }

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nWeight: " + getWeight() + " kg" +
                "\nCountry of origin: " + getCountryOfOrigin() +
                "\nWay of holding: " + getWayOfHolding();
    }

}
