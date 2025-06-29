package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Sklep.java
//  @ Date : 22.05.2025
//  @ Author : 
//
//




public class Sklep {
	public Produkt Produkt;
	private Zamowienie Zamowienie = new Zamowienie();
	private Platnosci Platnosci = new Platnosci();
	private StanProduktu StanProduktu = new StanProduktu();
	private Autoryzacja Autoryzacja = new Autoryzacja();

	public void sprawdzDostepnosc(Produkt produkt) {
		if(StanProduktu.dostepnoscProduktu(produkt)){
			System.out.println("Produkt dostepny");
		} else {
			System.out.println("Produkt niedostpny");
		}
	}
	
	public void dodajProduktDoZamowienia(Produkt produkt) {
		if(StanProduktu.dostepnoscProduktu(produkt)){
			Zamowienie.dodajProdukt(produkt);
		} else {
			System.out.println("Produkt niedostpny");
		}
	}
	
	public void zaplacZaZamowienie() {
		double suma = Zamowienie.obliczSume();
		Platnosci.zaplac(suma);
	}

	public void zalogujUzytkownika(String login, String haslo){
		Autoryzacja.zaloguj(login, haslo);
	}

	public void wylogujuzytkownika(){
		Autoryzacja.wyloguj();
	}
}
