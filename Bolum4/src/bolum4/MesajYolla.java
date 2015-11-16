package bolum4;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
public class MesajYolla {

	public static void main(String[] args) {
		//VeriYolla sýnýfýnýn nesnesinin oluþturulmasý
		VeriYolla veri =  new VeriYolla();
		String cumle = "";
		int sembolSay;
		//Kullanýcýdan metin alýnýyor
		Scanner giris = new Scanner(System.in);
		System.out.println("Metin giriniz..");
		cumle=giris.nextLine();
		giris.close();
		veri.mesaj= cumle;
		sembolSay = veri.veriYazdýr();	
		System.out.println("Sembol Sayýsý= "+sembolSay);

	}

}
