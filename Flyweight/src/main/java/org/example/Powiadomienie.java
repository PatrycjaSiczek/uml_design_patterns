package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Powiadomienie.java
//  @ Date : 14.06.2025
//  @ Author : 
//
//

public class Powiadomienie {
	private int x;
	private int y;
	public String wiadomosc;
	private PowiadomieniaStyl styl;

	public Powiadomienie(int x, int y, String wiadomosc, PowiadomieniaStyl styl) {
		this.x = x;
		this.y = y;
		this.wiadomosc = wiadomosc;
		this.styl = styl;
	}

	public void rysuj() {
		styl.rysuj(x, y, wiadomosc);
	}
}
