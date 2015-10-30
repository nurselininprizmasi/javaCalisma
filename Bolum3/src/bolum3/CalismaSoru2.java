package bolum3;
// break komutunun kullanýlmasý
import java.util.Scanner;

public class CalismaSoru2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		int malzemeNo;
		double deger, toplam = 0.0;
		System.out.println("10 tane malzeme alabilirsiniz");
		System.out.println("Toplam harcama 100 tl yi geçemez");
		
		for(malzemeNo = 0; malzemeNo <10;malzemeNo++)
		{
			System.out.println("Malzeme#"+ (malzemeNo+1) );
			System.out.println("Fiyatý: ");
			deger = giris.nextDouble();
			toplam = toplam +deger;
			if(toplam >= 100)
			{
				System.out.println("Tüm paranýzý harcadýnýz..");
				break; // 100 liraya ulaþýnca döngüyü kýrar
			}
			System.out.println("Þuana kadar harcadýðýnýz toplam para:");
			System.out.println(toplam);
			System.out.println("Alabileceðiniz " +(10 - malzemeNo) +" adet malzemeniz kaldý");
		}
		System.out.println(" Döngüden çýkýldý");
		System.out.println("Toplam harcamanýz " +toplam + " Lira");
		giris.close();
		
	}

}
