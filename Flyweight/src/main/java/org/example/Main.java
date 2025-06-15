package org.example;


public class Main {
    public static void main(String[] args) {
        CentrumPowiadomien centrum = new CentrumPowiadomien();
        TablicaPowiadomien tablica = new TablicaPowiadomien();

        PowiadomieniaStyl blad = centrum.pobierzStyl("czerwony", "!");
        PowiadomieniaStyl info = centrum.pobierzStyl("niebieski", ":)");

        tablica.dodajPowiadomienie(10, 20, "Błąd ładowania", blad);
        tablica.dodajPowiadomienie(10, 25, "Nowa wiadomość", info);
        tablica.dodajPowiadomienie(10, 20, "Brak internetu", blad);

        tablica.pokazPowiadomienia();
    }
}