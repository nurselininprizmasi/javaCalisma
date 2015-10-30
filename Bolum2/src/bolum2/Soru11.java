package bolum2;

import java.util.Scanner;

//3 basamaklý bir sayýnýn rakamlarý toplamýný ve çarðýmýný  hesaplayan program
public class Soru11 {
	static int yuzlerbas, onlarbas, birlerbas;
	static int sayi,basamakTop,basamakCarp;
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		System.out.println("3 basamaklý bir sayý giriniz.. !!");
		sayi = giris.nextInt();
		giris.close();
		basamakHesapla(sayi);
		basamakTop = yuzlerbas + onlarbas + birlerbas ;
		basamakCarp = yuzlerbas * onlarbas * birlerbas;
		System.out.println("Rakamlarýn Toplamý:  "+basamakTop);
		System.out.println("Rakamlarýn Çarpýmý:  "+basamakCarp);
	}

	static void basamakHesapla(int sayi) {
		yuzlerbas = sayi / 100;
		sayi = sayi % 100;
		onlarbas = sayi / 10;
		sayi = sayi % 10;
		birlerbas = sayi;
		
	}

}
