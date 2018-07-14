package com.epam.hwone.entity;

public class Strings extends MusicalInstrument {
    private int numberOfStrings;
    private String form;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Type of musical instrument: " + getName() +
                "\nMin range of note: " + getMinRangeOfNote() +
                "\nMax range of note: " + getMaxRangeOfNote();
    }

}


