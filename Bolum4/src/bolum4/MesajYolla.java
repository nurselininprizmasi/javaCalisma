package bolum4;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
public class MesajYolla {

	public static void main(String[] args) {
		//VeriYolla s�n�f�n�n nesnesinin olu�turulmas�
		VeriYolla veri =  new VeriYolla();
		String cumle = "";
		int sembolSay;
		//Kullan�c�dan metin al�n�yor
		Scanner giris = new Scanner(System.in);
		System.out.println("Metin giriniz..");
		cumle=giris.nextLine();
		giris.close();
		veri.mesaj= cumle;
		sembolSay = veri.veriYazd�r();	
		System.out.println("Sembol Say�s�= "+sembolSay);

	}

}
