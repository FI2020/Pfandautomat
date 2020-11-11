package com.company;

public class Main {

    static double pfandsumme = 0;

    static void pfandBerechnen(Verpackung einwurf){
        pfandsumme += einwurf.pfandwert;
    }

    public static void main(String[] args) {

        System.out.println("Bitte Pfand einwerfen, AMK-alda...");
        Bierflasche bitburger = new Bierflasche();
        Wasserflasche gerolsteiner = new Wasserflasche();
        Dose faxe = new Dose();

        pfandBerechnen(bitburger);
        pfandBerechnen(gerolsteiner);
        pfandBerechnen(faxe);

        System.out.println(String.format("Ihr Pfand beträgt " + pfandsumme, 0.00 ) + " €");
    }
}
