package bolum4;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
//metodlar�n kullan�m�
public class OgrenciKayit {
	private String ad;
	private int kisaSinav1, kisaSinav2, araSinav, finalSinavi;
	private double toplamPuani;
	private char not;

	public void setToplamPuani() {
		toplamPuani = 0.25 * (kisaSinav1 + kisaSinav2) / 2.0 + 0.5 * finalSinavi + 0.25 * araSinav;
	}

	public void setNot() {
		if (toplamPuani >= 90.0)
			not = 'A';
		else if (toplamPuani >= 80.0)
			not = 'B';
		else if (toplamPuani >= 70.0)
			not = 'C';
		else if (toplamPuani >= 60.0)
			not = 'D';
		else
			not = 'F';
	}

	public void veriGir() {
		Scanner giris = new Scanner(System.in);
		System.out.println("��renci ad�n� giriniz..");
		ad = giris.next();
		System.out.println("��rencinin ilk notunu giriniz..");
		kisaSinav1 = giris.nextInt();
		System.out.println("��rencinin ikinci notunu giriniz..");
		kisaSinav2 = giris.nextInt();
		System.out.println("��rencinin arasinavini giriniz..");
		araSinav = giris.nextInt();
		System.out.println("��rencinin final notunu giriniz..");
		finalSinavi = giris.nextInt();
		giris.close();
	}

	public void ciktiYaz() {
		System.out.println("�smi " + ad);
		System.out.println("Toplam Puan� ve Not kar��l��� " + toplamPuani + " " + not);
	}
}
