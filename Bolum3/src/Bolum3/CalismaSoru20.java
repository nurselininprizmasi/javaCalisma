package Bolum3;

public class CalismaSoru20 {

	public static void main(String[] args) {
		int sayac;
		for(sayac=1;sayac<=5;sayac++)
		{
			if(sayac==3)
				break;
			System.out.println("Merhaba");
			
		}
		System.out.println("Döngüden çýkýþ");

//		for(sayac=1;sayac<=5;sayac++)
//		{
//			if(sayac==3)
//				System.exit(0);
//			System.out.println("Merhaba");
//			
//		}
//		System.out.println("Döngüden çýkýþ");
		for(sayac = 1; sayac <= 3; sayac++)
		{
			switch (sayac) {
			case 1:
				System.out.println("Bir");
				break;
			case 2:
				System.out.println("Ýki");
				break;
			case 3:
				System.out.println("Üç");
				break;
			default:
				System.out.println("Kabul edilen durum");
				break;
			}
		}
		System.out.println("Döngüden çýkýþ");
		//soru25
		int sayi = 7;
		boolean pozitifIse = (sayi > 0);
		if(sayi > 0);
		sayi = -100;
		if(pozitifIse)
			System.out.println("Pozitif");
		else 
			System.out.println("Pozitif Deðil");
		//soru26
		System.out.println(false);
		System.out.println(7<0);
		System.out.println(7>0);
		int sayi2 =7;
		System.out.println(sayi2>0);
	}

}
