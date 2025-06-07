package org.example;

public class Main {
    public static void main(String[] args) {
        Cukiernik cukiernik = new Cukiernik();
        BudowniczyTort budowniczyTort = new BudowniczyTort();
        BudowniczyInstrukcjaTort budowniczyInstrukcja = new BudowniczyInstrukcjaTort();

        cukiernik.zrobTortUrodzinowy(budowniczyTort);
        Tort tort = budowniczyTort.wynik();
        cukiernik.zrobTortUrodzinowy(budowniczyInstrukcja);
        Instrukcja instrukcja = budowniczyInstrukcja.wynik();

        System.out.println(instrukcja);
        System.out.println(tort);

    }
}