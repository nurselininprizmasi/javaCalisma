package bolum4;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
public class DeneKesirliSayi {

	public static void main(String[] args) {
		int pay1, pay2, payda1, payda2;

		KesirliSayi ilkSayi = new KesirliSayi();
		KesirliSayi ikinciSayi = new KesirliSayi();
		KesirliSayi sayilarToplamý;
		KesirliSayi sonSayi = new KesirliSayi();
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Birinci sayýnýn payýný ve paydasýný giriniz:");
		pay1 = giris.nextInt();
		payda1 = giris.nextInt();
		ilkSayi.setPay(pay1);
		ilkSayi.setPayda(payda1);
		
		System.out.println("Ýkinci sayýnýn payýný ve paydasýný giriniz:");
		pay2 = giris.nextInt();
		payda2 = giris.nextInt();
		ikinciSayi.setPay(pay2);
		ikinciSayi.setPayda(payda2);
		
		sayilarToplamý = ilkSayi.topla(ikinciSayi);
		sayilarToplamý.yazdir();
		sonSayi.setPay(7);
		sonSayi.setPayda(8);
		sonSayi.yazdir();
	}

}
