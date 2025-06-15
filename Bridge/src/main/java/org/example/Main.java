package org.example;

public class Main {
    public static void main(String[] args) {

        FormatDokumentu pdf = new PDF();
        ProsteEdytowanie edytor = new ProsteEdytowanie(pdf);
        FormatDokumentu docx = new DOCX();
        ZaawansowaneEdytowanie edytor2 = new ZaawansowaneEdytowanie(docx);

        edytor.wpisz("Ala ma kota.");
        edytor.zapisz("Ala ma kota");
        edytor.zwiekszCzcionke();
        edytor.dodajNaglowek("Tytuł dokumentu");
        edytor2.wpisz("Zaawansowany dokument");
        edytor2.dodajStopkeINaglowek("Nagłówek", "Stopka");
        edytor2.szyfrujZapis("Szyfrowane Dane");
    }
}