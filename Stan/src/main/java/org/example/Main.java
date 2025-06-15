package org.example;

public class Main {
    public static void main(String[] args) {
        OdtwarzaczMuzyki odtwarzacz = new OdtwarzaczMuzyki();

        odtwarzacz.kliknijOtworzZatrzymaj();
        odtwarzacz.kliknijNastepny();
        odtwarzacz.kliknijPoprzedni();
        odtwarzacz.kliknijNastepny();
        odtwarzacz.kliknijNastepny();

        System.out.println("\nPauzowanie odtwarzania...");
        odtwarzacz.kliknijOtworzZatrzymaj();

        System.out.println("\nWznawianie odtwarzania...");
        odtwarzacz.kliknijOtworzZatrzymaj();

    }
}