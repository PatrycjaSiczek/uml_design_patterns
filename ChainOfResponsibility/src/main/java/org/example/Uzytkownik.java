package org.example;

public class Uzytkownik {
    public String imie;
    public String nazwisko;
    public String pin;
    public String haslo;
    public String kodSms;
    public String odciskPalca;

    public Uzytkownik(String imie, String nazwisko, String pin, String haslo, String kodSms, String odciskPalca) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pin = pin;
        this.haslo = haslo;
        this.kodSms = kodSms;
        this.odciskPalca = odciskPalca;
    }
}
