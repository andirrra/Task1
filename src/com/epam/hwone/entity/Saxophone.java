package com.epam.hwone.entity;

public class Saxophone extends Wind {
    private String starOfJazz;

    public String getStarOfJazz() {
        return starOfJazz;
    }

    public void setStarOfJazz(String starOfJazz) {
        this.starOfJazz = starOfJazz;
    }

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nWeight: " + getWeight() + " kg" +
                "\nCountry of origin:" + getCountryOfOrigin() +
                "\nStars of Jazz:" + getStarOfJazz();
    }

}
