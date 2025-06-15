package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produkt> koszyk = List.of(
                new Laptop(3500),
                new Telefon(1800),
                new Tablet(2100)
        );

        Klient klient = new Klient("Patrycja", koszyk);
        klient.sprawdzRabaty();
    }
}