package org.example;

public class Main {
    public static void main(String[] args) {

        Kucharz polski = new Kucharz(new KuchniaPolska());
        Kucharz wloski = new Kucharz(new KuchniaWLoska());

        System.out.println("Polska kuchnia:");
        polski.przygotujZestaw();

        System.out.println("\nWłoska kuchnia:");
        wloski.przygotujZestaw();
    }
}