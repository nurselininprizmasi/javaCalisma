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
		KesirliSayi sayilarToplam�;
		KesirliSayi sonSayi = new KesirliSayi();
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Birinci say�n�n pay�n� ve paydas�n� giriniz:");
		pay1 = giris.nextInt();
		payda1 = giris.nextInt();
		ilkSayi.setPay(pay1);
		ilkSayi.setPayda(payda1);
		
		System.out.println("�kinci say�n�n pay�n� ve paydas�n� giriniz:");
		pay2 = giris.nextInt();
		payda2 = giris.nextInt();
		ikinciSayi.setPay(pay2);
		ikinciSayi.setPayda(payda2);
		
		sayilarToplam� = ilkSayi.topla(ikinciSayi);
		sayilarToplam�.yazdir();
		sonSayi.setPay(7);
		sonSayi.setPayda(8);
		sonSayi.yazdir();
	}

}
