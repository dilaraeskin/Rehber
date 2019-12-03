package com.uniyaz;

import java.util.Scanner;


public class Kisi 
{
	private static int kisiIdCounter;
	int id;
	String kisiİsim;
	String kisiSoyisim;
	String kisiTelefon;
	
	public Kisi(String isim, String soyad, String telefon) {
		kisiIdCounter++;
		this.id=kisiIdCounter;
		this.kisiİsim=isim;
		this.kisiSoyisim=soyad;
		this.kisiTelefon=telefon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKisiİsim() {
		return kisiİsim;
	}
	public void setKisiİsim(String kisiİsim) {
		this.kisiİsim = kisiİsim;
	}
	public String getKisiSoyisim() {
		return kisiSoyisim;
	}
	public void setKisiSoyisim(String kisiSoyisim) {
		this.kisiSoyisim = kisiSoyisim;
	}
	public String getKisiTelefon() {
		return kisiTelefon;
	}
	public void setKisiTelefon(String kisiTelefon) {
		this.kisiTelefon = kisiTelefon;
	}


}
