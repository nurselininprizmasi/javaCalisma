package bolum3;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
//4 i�lem uygulamas�
//switch-case
public class Soru10 {

	public static void main(String[] args) {
		char islem;
		int sayi1,sayi2;
		double sonuc;
		Scanner giris = new Scanner (System.in);
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz..");
		System.out.println("Toplama i�lemi i�in \"+\"");
		System.out.println("��karma i�lemi i�in \"-\"");
		System.out.println("�arpma i�lemi i�in \"*\"");
		System.out.println("B�lme i�lemi i�in \"/\"");
		System.out.println("Giriniz..");
		islem=giris.next().trim().charAt(0);
		if(islem=='+' || islem=='-' || islem=='*' || islem=='/' ){
		System.out.println(islem +" i�lemini se�tiniz..");
		System.out.println("L�tfen say�lar� giriniz");
		System.out.println("�lk say�");
		sayi1 = giris.nextInt();
		System.out.println("�kinci say�");
		sayi2 = giris.nextInt();
		switch (islem) {
		case '+'://Toplama i�lemi
			sonuc = sayi1 + sayi2;
			System.out.println(sayi1 +"+" +sayi2 +"= " +sonuc);
			break;
		case '-'://��karma i�lemi
			sonuc = sayi1 - sayi2;
			System.out.println(sayi1 +"-" +sayi2 +"= " +sonuc);
			break;
		case '*'://�arpma ��lemi
			sonuc = sayi1 * sayi2;
			System.out.println(sayi1 +"*" +sayi2 +"= " +sonuc);
			break;
		case '/'://B�lme ��lemi
			if(sayi2 != 0)
			{
				sonuc = sayi1 / sayi2;
				System.out.println(sayi1 +"/" +sayi2 +"= " +sonuc);
				break;
			}
			else 
				System.out.println("Sayi 0'a b�l�nemez!!");
			break;
		}
		
		}
		else
		{
			System.out.println("B�yle bir i�lem tan�ml� de�il");
		}
		giris.close();
		
	}

}
