package bolum2;

import java.util.Scanner;

//Girilen paran�n kurus olarak hesaplanmas�
public class Soru3 {

	public static void main(String[] args) {
		double girilenMiktar;
		double miktar;
		int miktarDonusum;
		int birKurus, besKurus, onKurus, yirmibesKurus, elliKurus, birLira;
		Scanner giris = new Scanner(System.in);
		System.out.println("Para Miktar� giriniz.. !!");
		System.out.println("0,0 - 999,0 aras�nda bir de�er olmal�d�r!!");
		girilenMiktar = giris.nextDouble();
		giris.close();
		miktar = girilenMiktar;
		miktarDonusum = (int) ( miktar * 100 );
		System.out.println("Miktar�n kurusa �evrilmi� hali: " + miktarDonusum);
		//Hesaplama yap�lmas�
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
		//Sonu�lar�n yazd�r�lmas�
		System.out.println("Girilen De�er : " +girilenMiktar);
		System.out.println(birLira + " tane 1 L�RA");
		System.out.println(elliKurus+ " tane 50 KURU�");
		System.out.println(yirmibesKurus + " tane 25 KURU�");
		System.out.println(onKurus+ " tane 10 KURU�");
		System.out.println(besKurus+ " tane 5 KURU�");
		System.out.println(birKurus+ " tane 1 KURU�");
		
		
	}

}
