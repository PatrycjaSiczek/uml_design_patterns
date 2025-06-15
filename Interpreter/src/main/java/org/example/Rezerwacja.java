package org.example;

public class Rezerwacja {
    public String rodzajPokoju;
    public int dniDoPrzyjazdu;
    public int liczbaNocy;

    public Rezerwacja(String rodzajPokoju, int dniDoPrzyjazdu, int liczbaNocy) {
        this.rodzajPokoju = rodzajPokoju;
        this.dniDoPrzyjazdu = dniDoPrzyjazdu;
        this.liczbaNocy = liczbaNocy;
    }
}
