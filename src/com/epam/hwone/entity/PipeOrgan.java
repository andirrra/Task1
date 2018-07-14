package com.epam.hwone.entity;

public class PipeOrgan extends Wind {
    private int numberOfKey;
    private int numberOfPipe;

    public int getNumberOfKey() {
        return numberOfKey;
    }

    public void setNumberOfKey(int numberOfKey) {
        this.numberOfKey = numberOfKey;
    }

    public int getNumberOfPipe() {
        return numberOfPipe;
    }

    public void setNumberOfPipe(int numberOfPipe) {
        this.numberOfPipe = numberOfPipe;
    }

    @Override
    public String toString() {
        return "Material of instrument: " + getMaterialOfInstrument() +
                "\nNumber of keys: " + getNumberOfKey() +
                "\nCountry of origin:" + getCountryOfOrigin() +
                "\nNumber of pipes:" + getNumberOfPipe();
    }

}
