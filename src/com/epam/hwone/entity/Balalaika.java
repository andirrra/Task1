package com.epam.hwone.entity;

public class Balalaika extends Strings {
    private String modernBalalaika;

    public String getModernBalalaika() {
        return modernBalalaika;
    }

    public void setModernBalalaika(String modernBalalaika) {
        this.modernBalalaika = modernBalalaika;
    }

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nCountry of origin: " + getCountryOfOrigin() +
                "\nModern Balalaika: " + getModernBalalaika();
    }

}
