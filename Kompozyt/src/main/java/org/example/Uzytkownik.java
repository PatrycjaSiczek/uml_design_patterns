package org.example;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Uzytkownik.java
//  @ Date : 31.05.2025
//  @ Author : 
//
//

public class Uzytkownik {
	private String login;

	public Uzytkownik(String login) {
		this.login = login;
	}

	public void odtworz(Dzwiek dzwiek){
		System.out.println("Uzytkownik: " + login);
		dzwiek.start();
	}

	public void zatrzymaj(Dzwiek dzwiek){
		dzwiek.stop();
	}

}
