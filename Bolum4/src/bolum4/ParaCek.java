package bolum4;

import java.util.Scanner;

public class ParaCek {

	public static void main(String[] args) {
		double bakiye, cekilenMiktar;
		Scanner giris = new Scanner(System.in);
		BankaHesabi hesap = new BankaHesabi();//nesne olu�turuluyor
		System.out.println("Hesap Bakiyenizi giriniz..");
		bakiye = giris.nextDouble();
		hesap.setHesapBakiyesi(bakiye);//nesneye ait de�i�ken i�in set metodu �a�r�l�yor
		System.out.println("�ekilecek Miktar� giriniz..");
		cekilenMiktar = giris.nextDouble();
		giris.close();
		bakiye = hesap.paraCek(cekilenMiktar);//classa ait metod nesne ile �a�r�l�yor
		System.out.println("Para �ekme i�leminiz ba�ar�yla sonu�land�");
		System.out.println("Hesab�n�zda kalan miktar: " +bakiye);

	}

}
