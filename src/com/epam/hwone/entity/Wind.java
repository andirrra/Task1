package com.epam.hwone.entity;

public class Wind extends MusicalInstrument {
    private String typeOfMouthpiece;

    public String getTypeOfMouthpiece() {
        return typeOfMouthpiece;
    }

    public void setTypeOfMouthpiece(String typeOfMouthpiece) {
        this.typeOfMouthpiece = typeOfMouthpiece;
    }

    @Override
    public String toString() {
        return "Type of musical instrument: " + getName() +
                "\nType of mouthpiece: " + getTypeOfMouthpiece();
    }

}
