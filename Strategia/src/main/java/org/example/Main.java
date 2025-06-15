package org.example;


public class Main {
    public static void main(String[] args) {
        DietaStrategia keto = new Ketogeniczna();
        DietaStrategia wegan = new Wegetarianska();
        DietaStrategia weganska = new Weganska();

        Osoba kasia = new Osoba("kasia", 20, 1.5, wegan);
        kasia.pokazInfo();
        kasia.jedz();

        kasia.zmienStrategie(keto);
        kasia.jedz();
    }
}