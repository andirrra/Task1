package com.epam.hwone.entity;

public class Dombyra extends Strings {
    private String materialOfObechaika;
    private String materialOfStringHolder;

    public String getMaterialOfObechaika() {
        return materialOfObechaika;
    }

    public void setMaterialOfObechaika(String materialOfObechaika) {
        this.materialOfObechaika = materialOfObechaika;
    }

    public String getMaterialOfStringHolder() {
        return materialOfStringHolder;
    }

    public void setMaterialOfStringHolder(String materialOfStringHolder) {
        this.materialOfStringHolder = materialOfStringHolder;
    }

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nNumber of strings: " + getNumberOfStrings() +
                "\nMaterial of obechaika: " + getMaterialOfObechaika() +
                "\nMaterial of string holder: " + getMaterialOfStringHolder();
    }

}
