package bolum2;

import java.util.Scanner;

// Klavyeden girilen yar��ap bilgisine g�re dairenin alan�n�n ve �evresinin hesaplanmas� i�lemidir.
public class Soru2 {
	public static final double PISAYISI = 3.14;
	public static void main(String[] args) {
		double yaricap;
		Scanner giris = new Scanner(System.in);
		System.out.println("Yari�ap de�eri giriniz.. \"0 dan farkl� de�er olmal�d�r! \" ");
		yaricap = giris.nextDouble();
		giris.close();
		System.out.println(" Dairenin alan�: " + alanHesapla(yaricap));
		System.out.println(" Dairenin cevresi: " + cevreHesapla(yaricap));

	}

	 static double alanHesapla(double yaricap) {
		double alan;
		alan = PISAYISI * yaricap * yaricap;
		return alan;
	}
	 static double cevreHesapla(double yaricap) {
			double cevre;
			cevre = 2 * PISAYISI * yaricap ;
			return cevre;
		}
}
