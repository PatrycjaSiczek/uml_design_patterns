package org.example;

public class Ksiazka {
    private String tytul;
    private String autor;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "\"" + tytul + "\" autorstwa " + autor;
    }
}
