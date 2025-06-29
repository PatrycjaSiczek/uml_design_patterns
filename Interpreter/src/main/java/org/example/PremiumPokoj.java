package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : PremiumPokoj.java
//  @ Date : 07.06.2025
//  @ Author : 
//
//

public class PremiumPokoj implements Wyrazenie {
	private Rezerwacja kontekst;

	public PremiumPokoj(Rezerwacja kontekst) {
		this.kontekst = kontekst;
	}

	@Override
	public boolean interpretuj() {
		return "premium".equalsIgnoreCase(kontekst.rodzajPokoju);
	}

	@Override
	public String toString() {
		return "Warunek: czy pokój to premium?";
	}
}
