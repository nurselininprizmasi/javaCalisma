package bolum4;

import java.util.Scanner;

public class ParaCek {

	public static void main(String[] args) {
		double bakiye, cekilenMiktar;
		Scanner giris = new Scanner(System.in);
		BankaHesabi hesap = new BankaHesabi();//nesne oluþturuluyor
		System.out.println("Hesap Bakiyenizi giriniz..");
		bakiye = giris.nextDouble();
		hesap.setHesapBakiyesi(bakiye);//nesneye ait deðiþken için set metodu çaðrýlýyor
		System.out.println("Çekilecek Miktarý giriniz..");
		cekilenMiktar = giris.nextDouble();
		giris.close();
		bakiye = hesap.paraCek(cekilenMiktar);//classa ait metod nesne ile çaðrýlýyor
		System.out.println("Para çekme iþleminiz baþarýyla sonuçlandý");
		System.out.println("Hesabýnýzda kalan miktar: " +bakiye);

	}

}
