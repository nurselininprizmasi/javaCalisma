package Bolum3;
//girilen say� kadar d�ng� say�s� hesaplama
import java.util.Scanner;

public class CalismaSoru3 {

	public static void main(String[] args) {
		int sayac, sayi;
		Scanner giris = new Scanner (System.in);
		sayac =1;
		while( sayac>0){
		sayi = giris.nextInt();
		System.out.println("Girdi�iniz say�: " +sayi);
		System.out.println("tekrar say�s�: " +sayac);
		sayac++;
		}
		giris.close();
		//Sonsuz d�ng�
//		while (sayac <3){
//			System.out.println(sayac);
//			sayac--;
//			break;
//		}
//		System.out.println("tekrar say�s� " + sayac);
//		//double sayac;
//		double sayac1 ;
//		 for(sayac1 = 0; sayac1 < 3 ;sayac1=sayac1+0.5)
//		 System.out.println("sayac: " +sayac1);
	}

}
