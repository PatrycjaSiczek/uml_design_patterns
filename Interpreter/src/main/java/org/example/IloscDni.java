package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : IloscDni.java
//  @ Date : 07.06.2025
//  @ Author : 
//
//

public class IloscDni implements Wyrazenie {
	private Rezerwacja kontekst;
	private int limit;

	public IloscDni(Rezerwacja kontekst, int limit) {
		this.kontekst = kontekst;
		this.limit = limit;
	}

	@Override
	public boolean interpretuj() {
		return kontekst.liczbaNocy <= limit;
	}

	@Override
	public String toString() {
		return "Warunek: czy liczba nocy <= " + limit + "?";
	}
}
