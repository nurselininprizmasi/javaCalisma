package bolum2;

import java.util.Scanner;

// Klavyeden girilen yarýçap bilgisine göre dairenin alanýnýn ve çevresinin hesaplanmasý iþlemidir.
public class Soru2 {
	public static final double PISAYISI = 3.14;
	public static void main(String[] args) {
		double yaricap;
		Scanner giris = new Scanner(System.in);
		System.out.println("Yariçap deðeri giriniz.. \"0 dan farklý deðer olmalýdýr! \" ");
		yaricap = giris.nextDouble();
		giris.close();
		System.out.println(" Dairenin alaný: " + alanHesapla(yaricap));
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
