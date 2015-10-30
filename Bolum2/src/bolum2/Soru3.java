package bolum2;

import java.util.Scanner;

//Girilen paranýn kurus olarak hesaplanmasý
public class Soru3 {

	public static void main(String[] args) {
		double girilenMiktar;
		double miktar;
		int miktarDonusum;
		int birKurus, besKurus, onKurus, yirmibesKurus, elliKurus, birLira;
		Scanner giris = new Scanner(System.in);
		System.out.println("Para Miktarý giriniz.. !!");
		System.out.println("0,0 - 999,0 arasýnda bir deðer olmalýdýr!!");
		girilenMiktar = giris.nextDouble();
		giris.close();
		miktar = girilenMiktar;
		miktarDonusum = (int) ( miktar * 100 );
		System.out.println("Miktarýn kurusa çevrilmiþ hali: " + miktarDonusum);
		//Hesaplama yapýlmasý
		birLira = miktarDonusum / 100 ;
		miktarDonusum = miktarDonusum % 100;
		elliKurus = miktarDonusum / 50 ;
		miktarDonusum = miktarDonusum % 50;
		yirmibesKurus = miktarDonusum / 25 ;
		miktarDonusum = miktarDonusum % 25;
		onKurus = miktarDonusum / 10;
		miktarDonusum = miktarDonusum % 10;
		besKurus = miktarDonusum / 5;
		miktarDonusum = miktarDonusum % 5;
		birKurus = miktarDonusum;
		//Sonuçlarýn yazdýrýlmasý
		System.out.println("Girilen Deðer : " +girilenMiktar);
		System.out.println(birLira + " tane 1 LÝRA");
		System.out.println(elliKurus+ " tane 50 KURUÞ");
		System.out.println(yirmibesKurus + " tane 25 KURUÞ");
		System.out.println(onKurus+ " tane 10 KURUÞ");
		System.out.println(besKurus+ " tane 5 KURUÞ");
		System.out.println(birKurus+ " tane 1 KURUÞ");
		
		
	}

}
