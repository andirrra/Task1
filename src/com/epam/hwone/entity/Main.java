package com.epam.hwone.entity;

public class Main {

    public static void main(String[] args) {
        Strings str = new Strings();
        str.setName("String");
        str.setMinRangeOfNote("Fa");
        str.setMaxRangeOfNote("Do");

        Wind wind = new Wind();
        wind.setName("Wind");
        wind.setTypeOfMouthpiece("Multi-nozzle");

        Flute flute = new Flute();
        flute.setMaterialOfInstrument("Wood");
        flute.setWeight(1.0);
        flute.setCountryOfOrigin("China");
        flute.setWayOfHolding("Longitudinal");

        Saxophone saxophone = new Saxophone();
        saxophone.setMaterialOfInstrument("Red brass");
        saxophone.setWeight(1.86);
        saxophone.setCountryOfOrigin("France");
        saxophone.setStarOfJazz("Coleman «Hawk» Hawkins, John William Coltrane");

        PipeOrgan pipeOrgan = new PipeOrgan();
        pipeOrgan.setMaterialOfInstrument("Brass");
        pipeOrgan.setNumberOfKey(61);
        pipeOrgan.setNumberOfPipe(30000);

        Balalaika balalaika = new Balalaika();
        balalaika.setMaterialOfInstrument("Wood");
        balalaika.setCountryOfOrigin("Russia");
        balalaika.setModernBalalaika("Balalaika-contrabass");

        Guitar guitar = new Guitar();
        guitar.setMaterialOfInstrument("Wood");
        guitar.setCountryOfOrigin("Spain");
        guitar.setNumberOfStrings(4);

        Dombyra dombyra = new Dombyra();
        dombyra.setMaterialOfInstrument("Wood");
        dombyra.setNumberOfStrings(2);
        dombyra.setMaterialOfObechaika("Maple");
        dombyra.setMaterialOfStringHolder("Wood");

        System.out.println(str);
        System.out.println();
        System.out.println(wind);
        System.out.println();
        System.out.println(flute);
        System.out.println();
        System.out.println(saxophone);
        System.out.println();
        System.out.println(pipeOrgan);
        System.out.println();
        System.out.println(balalaika);
        System.out.println();
        System.out.println(guitar);
        System.out.println();
        System.out.println(dombyra);

    }
}
