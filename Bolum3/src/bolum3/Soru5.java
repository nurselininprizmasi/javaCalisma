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

	 static double fonksiyonHesapla(double sayi) {
		int isaret = 1;
		int ustel = 1;
		int faktoriyel;
		double toplam = 0.0;
		double geciciTop,ustelHesap;
		//formülde üstel hesaplama ve faktöriyel ile bölme
		while(ustel <= 7)
		{
			ustelHesap = Math.pow(sayi,ustel);
			faktoriyel = faktoriyel(ustel);
			geciciTop = isaret * (ustelHesap / faktoriyel);
			toplam =toplam + geciciTop;
			isaret = isaret * -1;
			ustel +=2;

		}
		
		return toplam;
		
	}
	 //faktöriyelin hesaplanmasý
	static int faktoriyel(int ustel) {
		int faktor =1;
		for(int i=1;i<=ustel;i++)
		faktor=faktor*i;
		return faktor;
		
	}

}
