package org.example;

public class Main {
    public static void main(String[] args) {
        GraKarciana gra1 = new GraTysiac();
        gra1.rozegrajGre();

        System.out.println();

        GraKarciana gra2 = new GraPan();
        gra2.rozegrajGre();

        System.out.println();

        GraKarciana gra3 = new GraPiatka();
        gra3.rozegrajGre();
    }
}