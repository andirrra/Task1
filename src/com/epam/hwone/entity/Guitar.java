package com.epam.hwone.entity;

public class Guitar extends Strings {

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nCountry of origin: " + getCountryOfOrigin() +
                "\nNumber of strings: " + getNumberOfStrings();
    }

}
