package bolum3;

import java.util.Scanner;

//verilen formüle före fonksiyonun deðerinin hesaplanmasý
//formül 
//x - x^3/3! + x^5 / 5! - x^7 /7!
public class Soru5 {

	public static void main(String[] args) {
		double sayi;
		Scanner giris = new Scanner(System.in);
		System.out.println("Double deðer giriniz: ");
		sayi = giris.nextDouble();
		giris.close();
		System.out.println("Hesaplama sonucu: " + fonksiyonHesapla(sayi));
		
	}

	private static double fonksiyonHesapla(double sayi) {
		int isaret = 1;
		int ustel = 1;
		int faktoriyel;
		double toplam = 0.0;
		while(ustel == 7)
		{
			sayi=isaret*sayi;
			faktoriyel = faktoriyel(ustel);
			toplam = toplam + sayi;
		}
		
		return sayi;
		
	}

	private static int faktoriyel(int ustel) {
		
		return ustel;
		
	}

}
