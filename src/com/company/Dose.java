package com.company;

public class Dose extends Verpackung {

    public Dose(){
        name = "Dose";
        farbe = "chrom";
        pfandwert = 0.25;
        volumen = 0.33;
        System.out.println(name + " eingeworfen");
    }
}
