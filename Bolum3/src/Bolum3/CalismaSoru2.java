package Bolum3;
// break komutunun kullan�lmas�
import java.util.Scanner;

public class CalismaSoru2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner (System.in);
		int malzemeNo;
		double deger, toplam = 0.0;
		System.out.println("10 tane malzeme alabilirsiniz");
		System.out.println("Toplam harcama 100 tl yi ge�emez");
		
		for(malzemeNo = 0; malzemeNo <10;malzemeNo++)
		{
			System.out.println("Malzeme#"+ (malzemeNo+1) );
			System.out.println("Fiyat�: ");
			deger = giris.nextDouble();
			toplam = toplam +deger;
			if(toplam >= 100)
			{
				System.out.println("T�m paran�z� harcad�n�z..");
				break; // 100 liraya ula��nca d�ng�y� k�rar
			}
			System.out.println("�uana kadar harcad���n�z toplam para:");
			System.out.println(toplam);
			System.out.println("Alabilece�iniz " +(10 - malzemeNo) +" adet malzemeniz kald�");
		}
		System.out.println(" D�ng�den ��k�ld�");
		System.out.println("Toplam harcaman�z " +toplam + " Lira");
		giris.close();
		
	}

}
