package org.example;


public class Main {
    public static void main(String[] args) {
    Anglik anglik = new Anglik();
    InnyJezyk tlumacz = new Tlumacz(anglik);
    Polak polak = new Polak(tlumacz);

    polak.rozmawiaj();
    }
}