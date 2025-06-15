package org.example;


public class Main {
    public static void main(String[] args) {
    Uzytkownik uzytkownik = new Uzytkownik(
            "Patrycja", "Siczek", "1034", "haso123", "1234", "odcisk123");
    Weryfikacja weryfikacja = new Weryfikacja();
    weryfikacja.rozpocznijWeryfikacje(uzytkownik);
    }
}

