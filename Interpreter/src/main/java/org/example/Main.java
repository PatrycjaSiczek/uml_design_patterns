package org.example;


public class Main {
    public static void main(String[] args) {
        Rezerwacja kontekst = new Rezerwacja("premium", 2, 5);

        Wyrazenie warunekPremium = new PremiumPokoj(kontekst);
        Wyrazenie warunekMinimalneNoce = new MinimalnaLiczbaDni(kontekst, 3);
        Wyrazenie warunek = new WyrazenieI(warunekPremium, warunekMinimalneNoce);

        Recepcjonista recepcjonista = new Recepcjonista();
        recepcjonista.sprawdzRezerwacje(warunek);
    }
}