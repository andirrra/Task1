package com.epam.hwone.entity;

public abstract class MusicalInstrument {
    private boolean isPlaying;
    private String name;
    private String methodPlayed;
    private double weight;
    private String materialOfInstrument;
    private String countryOfOrigin;
    private String minRangeOfNote;
    private String maxRangeOfNote;

    public void setIsPlaying(boolean isPlaying){
        this.isPlaying = isPlaying;

    }

    public boolean getIsPlaying(){
        return isPlaying;
    }

    public void setHowPlayed(String methodPlayed){
        this.methodPlayed = methodPlayed;
    }

    public boolean playInstrument(){
        return isPlaying = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterialOfInstrument() {
        return materialOfInstrument;
    }

    public void setMaterialOfInstrument(String materialOfInstrument) {
        this.materialOfInstrument = materialOfInstrument;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getMinRangeOfNote() {
        return minRangeOfNote;
    }

    public void setMinRangeOfNote(String minRangeOfNote) {
        this.minRangeOfNote = minRangeOfNote;
    }
    public String getMaxRangeOfNote() {
        return maxRangeOfNote;
    }

    public void setMaxRangeOfNote(String maxRangeOfNote) {
        this.maxRangeOfNote = maxRangeOfNote;
    }

}
