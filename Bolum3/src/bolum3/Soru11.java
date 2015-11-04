package bolum3;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author nursen.eyupoglu
 *
 */
//Ekstra puaný hesaplama
//JOptionPane kullanýmý
public class Soru11 {

	public static void main(String[] args) {
		Object [] bagisOption = {"Evet","Hayýr"}; // Obje Dizisinin Oluþturulmasý
		Object [] cikisOption = {"Çýkýþ Yap","Hayýr"};
		int toplam,bolum,puan=0;
		Scanner giris = new Scanner(System.in);
		System.out.println("Toplam tutarý giriniz..");
		toplam = giris.nextInt();
		giris.close();
		if (toplam <250) {
			bolum = toplam / 50;
			puan = bolum * 10;
			
		} else if(toplam >=250 && toplam <500){
			bolum = toplam / 50;
			puan = bolum * 15;

		} else if(toplam >= 500){
			bolum = toplam / 50;
			puan = bolum * 20;
		}
		String mesaj = "Kazanýlan Tutar "+puan +"TL dir. Tutarý Kýzýlay Derneðine baðýþlamk ister misiniz?"; // Verilecek Mesaj
		String mesaj2 ="Toplamda "+puan+" TL baðýs yaptýnýz. Teþekkür ederiz.";
		String baslik = "Uyarý"; // Pencere Baþlýðý
		int cevap = JOptionPane.showOptionDialog(null, mesaj, baslik, JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE , null, bagisOption, null);
		if(cevap==JOptionPane.YES_OPTION)//Kullanýcý Evet butonuna basmýþsa 
		{
			JOptionPane.showOptionDialog(null, mesaj2, baslik, JOptionPane.CLOSED_OPTION, JOptionPane.OK_OPTION, null, cikisOption, null);
		}

	}

}
