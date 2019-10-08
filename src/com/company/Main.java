package com.company;

public class Main {

    public static void main(String[] args) {

        AvionMilitar RoyalAircraftFactory = new AvionMilitar(6.37f, "истребитель", "Anglia", 193);
        System.out.print("\n\n");
        System.out.print("class AvionMilitar --> RoyalAircraftFactory");
        System.out.print("\n");
        System.out.println(RoyalAircraftFactory.getMarimea());
        System.out.println(RoyalAircraftFactory.getTipul());
        System.out.println(RoyalAircraftFactory.getProducatorul());
        System.out.println(RoyalAircraftFactory.getViteza());
        System.out.print("\n\n\n");


        Arme AutomatKalasnikov = new Arme(7.62, "puscaDeAsalt", 45, "URSS", 715, "Negru");
        System.out.print("class AvionMilitar --> class Arme --> AutomatKalasnikov");
        System.out.print("\n\n");
        System.out.println(AutomatKalasnikov.getCalibrul());
        System.out.println(AutomatKalasnikov.getTipul());
        System.out.println(AutomatKalasnikov.getMarimea());
        System.out.println(AutomatKalasnikov.getProducatorul());
        System.out.println(AutomatKalasnikov.getViteza());
        System.out.println(AutomatKalasnikov.getCuloarea());


    }
}