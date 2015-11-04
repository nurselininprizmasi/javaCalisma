package bolum3;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
//4 iþlem uygulamasý
//switch-case
public class Soru10 {

	public static void main(String[] args) {
		char islem;
		int sayi1,sayi2;
		double sonuc;
		Scanner giris = new Scanner (System.in);
		System.out.println("Yapmak istediðiniz iþlemi seçiniz..");
		System.out.println("Toplama iþlemi için \"+\"");
		System.out.println("Çýkarma iþlemi için \"-\"");
		System.out.println("Çarpma iþlemi için \"*\"");
		System.out.println("Bölme iþlemi için \"/\"");
		System.out.println("Giriniz..");
		islem=giris.next().trim().charAt(0);
		if(islem=='+' || islem=='-' || islem=='*' || islem=='/' ){
		System.out.println(islem +" iþlemini seçtiniz..");
		System.out.println("Lütfen sayýlarý giriniz");
		System.out.println("Ýlk sayý");
		sayi1 = giris.nextInt();
		System.out.println("Ýkinci sayý");
		sayi2 = giris.nextInt();
		switch (islem) {
		case '+'://Toplama iþlemi
			sonuc = sayi1 + sayi2;
			System.out.println(sayi1 +"+" +sayi2 +"= " +sonuc);
			break;
		case '-'://Çýkarma iþlemi
			sonuc = sayi1 - sayi2;
			System.out.println(sayi1 +"-" +sayi2 +"= " +sonuc);
			break;
		case '*'://Çarpma Ýþlemi
			sonuc = sayi1 * sayi2;
			System.out.println(sayi1 +"*" +sayi2 +"= " +sonuc);
			break;
		case '/'://Bölme Ýþlemi
			if(sayi2 != 0)
			{
				sonuc = sayi1 / sayi2;
				System.out.println(sayi1 +"/" +sayi2 +"= " +sonuc);
				break;
			}
			else 
				System.out.println("Sayi 0'a bölünemez!!");
			break;
		}
		
		}
		else
		{
			System.out.println("Böyle bir iþlem tanýmlý deðil");
		}
		giris.close();
		
	}

}
