package bolum2;
//Girilen ana para , faiz ve y�l miktar�na g�re faiz miktar�n� hesaplayan program
import java.util.Scanner;

public class Soru5 {
	
	public static void main(String[] args) {
		double anaPara ;
		double faizOran�;
		double faizMiktar�;
		int sure;
		Scanner giris = new Scanner(System.in);
		System.out.println("Ana Para miktar�n� giriniz: ");
		anaPara = giris.nextDouble();
		System.out.println("Faiz Oran�n� giriniz: " );
		faizOran� = giris.nextDouble();
		System.out.println("Ka� y�ll�k hesaplanaca��n� giriniz: " );
		sure = giris.nextInt();
		giris.close();
		faizMiktar�=faizHesapla(anaPara,faizOran�,sure);
		System.out.println("Hesaplanan faiz miktar�: "+faizMiktar�);

	}

	 static double faizHesapla(double anaPara, double faizOran�, int sure) {
		double faizMik;
		faizMik = anaPara* faizOran� * sure;
		return faizMik;
		
	}

}
