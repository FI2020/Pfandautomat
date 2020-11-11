package com.company;

public class Bierflasche extends Verpackung {

    public Bierflasche(){
        name = "Bierflasche";
        farbe = "braun";
        pfandwert = 0.08;
        volumen = 0.5;
        System.out.println(name + " eingeworfen");
    }
}
