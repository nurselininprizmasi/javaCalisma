package bolum2;
//Girilen ana para , faiz ve yýl miktarýna göre faiz miktarýný hesaplayan program
import java.util.Scanner;

public class Soru5 {
	
	public static void main(String[] args) {
		double anaPara ;
		double faizOraný;
		double faizMiktarý;
		int sure;
		Scanner giris = new Scanner(System.in);
		System.out.println("Ana Para miktarýný giriniz: ");
		anaPara = giris.nextDouble();
		System.out.println("Faiz Oranýný giriniz: " );
		faizOraný = giris.nextDouble();
		System.out.println("Kaç yýllýk hesaplanacaðýný giriniz: " );
		sure = giris.nextInt();
		giris.close();
		faizMiktarý=faizHesapla(anaPara,faizOraný,sure);
		System.out.println("Hesaplanan faiz miktarý: "+faizMiktarý);

	}

	 static double faizHesapla(double anaPara, double faizOraný, int sure) {
		double faizMik;
		faizMik = anaPara* faizOraný * sure;
		return faizMik;
		
	}

}
