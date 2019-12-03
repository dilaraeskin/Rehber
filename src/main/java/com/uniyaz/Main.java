package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/************EKLENECEKLER*********
*************HER İŞLEMDEN SONRA GERİ TUŞU KOY
*************İSİM ARADIĞINDA DİĞER BİLGİLERDE GELSİN
*************KONTROLLER YOK MESELA TELEFON NUMARASI KAÇ HANELİ OLSUN HARF GİRİLMESİN VB.
*************TELEFONU LONG YAP**************/

public class Main {

	static List<Kisi> kisiList = new ArrayList<Kisi>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		RehberIslemleri rehberIslemleri = new RehberIslemleri();
		while (true) {
			System.out.println("*********************REHBER İŞLEMLERİ*********************");
			System.out.println("\n");
			System.out.println("1-Rehbere Ekle");
			System.out.println("2-Rehber Sil");
			System.out.println("3-Rehber Listele");
			System.out.println("4-Rehberde Arama");
			System.out.println("5-Çıkış");
			System.out.println("\nHangi İşlemi yapmak istiyorsunuz?");

			int secim = scanner.nextInt();

			if (secim == 1) {
				System.out.println("\n******************REHBERE EKLE İŞLEMİ******************");
				System.out.println("\n");
				scanner.nextLine();
				Kisi okunanKisi = rehberKisisiOku(scanner);
				rehberIslemleri.rehbereKisiEkle(okunanKisi, kisiList); 
				
			} else if (secim == 2) {
				System.out.println("\n******************REHBERDE SİLME İŞLEMİ******************");
				System.out.println("\n");				
		
				rehberIslemleri.rehberKisiSilme(kisiList); //2. metot çalışmıyor
				
			} else if (secim == 3) {
				System.out.println("\n******************REHBER LİSTELEME İŞLEMİ******************");
				System.out.println("\n");				
				rehberIslemleri.rehberListele(kisiList);
				
			} else if (secim == 4) {
				System.out.println("\n******************REHBERDE KİŞİ ARAMA******************");
				System.out.println("\n");
				rehberIslemleri.rehberdeKisiArama(kisiList);
				
			} else if (secim == 5) {

				System.out.println("ÇIKIŞ");
				break;
			}
		}

	}

	public static Kisi rehberKisisiOku(Scanner scanner) {
		System.out.println("İsim:");
		String isim = scanner.nextLine();

		System.out.println("Soyad:");
		String soyad = scanner.nextLine();

		System.out.println("Telefon:");
		String telefon = scanner.nextLine();

		Kisi kisi = new Kisi(isim, soyad, telefon);
		return kisi;

	}
}
