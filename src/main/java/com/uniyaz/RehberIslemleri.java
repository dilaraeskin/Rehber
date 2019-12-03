package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RehberIslemleri {

	public void rehbereKisiEkle(Kisi kisi, List<Kisi> kisiList) {
		kisiList.add(kisi);
	}

	public void rehberListele(List<Kisi> kisiList) {

		System.out.println("Id\t\t\tİsim\t\t\tSoyad\t\t\tTelefon\t\t\t");
		for (Kisi kisi : kisiList) {
			System.out.println("\n"+kisi.getId() + "\t\t\t" + kisi.getKisiİsim() + "\t\t\t" + kisi.getKisiSoyisim() + "\t\t\t"
					+ kisi.getKisiTelefon());
		}
	}
	
	public void rehberKisiSilme(List<Kisi> kisiList) {
		//Silme işlemi seçiniz...
		Scanner silmeMetotSecimi = new Scanner(System.in);

		RehberIslemleri rehberIslemleri = new RehberIslemleri();
		
			System.out.println("1-Id ile Sil");
			System.out.println("\n2-İsim-Soyisim-Telefon Numarası Sil");


			System.out.println("Hangi Silme İşlemi yapmak istiyorsunuz?");

			int secim = silmeMetotSecimi.nextInt();

			if (secim == 1) {

				System.out.println("Silmek istediğiniz id numarasını giriniz");
				Scanner scannerSilinecekId = new Scanner(System.in);
				int silinecekId = scannerSilinecekId.nextInt();
				kisiList.remove(silinecekId-1);
				
			} else if (secim == 2) {
				
				// 2. seçenek olarak da ad,soyad,telefon yazıp silme özelliği olmalı
				System.out.println("Silmek istediğiniz kişinin ismini giriniz");
				Scanner scannerSilinecekİsim = new Scanner(System.in);
				String silinecekİsim = scannerSilinecekİsim.nextLine();

				System.out.println("\nSilmek istediğiniz kişinin soyismini giriniz");
				Scanner scannerSilinecekSoyisim = new Scanner(System.in);
				String silinecekSoyisim = scannerSilinecekSoyisim.nextLine();

				System.out.println("\nSilmek istediğiniz kişinin telefon numarasını giriniz");
				Scanner scannerSilinecekTelefon = new Scanner(System.in);
				String silinecekTelefon = scannerSilinecekTelefon.nextLine();

				for (int index = 0; index <= kisiList.size(); index++) {    //for çalışmıyor************
					if (kisiList.contains(silinecekİsim.toString())) {
						System.out.println("Aradığınız isim listede mevcut.");
						if (kisiList.contains(silinecekSoyisim.toString())) {
							System.out.println("Aradığınız soyisim listede mevcut.");
							if (kisiList.contains(silinecekTelefon.toString())) {
								System.out.println("Aradığınız telefon listede mevcut.");
								
								kisiList.remove(silinecekTelefon);
							} else
								System.out.println("Aradığınız kişi listede mevcut değil.");

						}
					

				}
			} 
		
		}
	}

	public void rehberdeKisiArama(List<Kisi> kisiList) {

		System.out.println("Arama yapmak istediğiniz kişinin ilk harflerini giriniz.");
		Scanner scannerGirilenHarf = new Scanner(System.in);

		// harfle başlayan kelimeleri listeleme
		ArrayList<String> arananHarfleBaşlayanList = new ArrayList<String>();
		String girilenHarfler = scannerGirilenHarf.nextLine();

		// kisilistte harfi arama.

		for (int i = 0; i < kisiList.size(); i++) {
			// eşleşiyorsa listeye yazdır.
			if (kisiList.get(i).kisiİsim.startsWith(girilenHarfler))
				arananHarfleBaşlayanList.add(kisiList.get(i).kisiİsim);

			System.out.println(arananHarfleBaşlayanList);
		}
    	

	
}
}