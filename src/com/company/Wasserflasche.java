package com.company;

public class Wasserflasche extends Verpackung {

    public Wasserflasche(){
        name = "Wasserflasche";
        farbe = "transparent";
        pfandwert = 0.15;
        volumen = 0.75;
        System.out.println(name + " eingeworfen");
    }
}
