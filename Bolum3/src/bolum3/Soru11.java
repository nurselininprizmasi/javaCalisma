package bolum3;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author nursen.eyupoglu
 *
 */
//Ekstra puan� hesaplama
//JOptionPane kullan�m�
public class Soru11 {

	public static void main(String[] args) {
		Object [] bagisOption = {"Evet","Hay�r"}; // Obje Dizisinin Olu�turulmas�
		Object [] cikisOption = {"��k�� Yap","Hay�r"};
		int toplam,bolum,puan=0;
		Scanner giris = new Scanner(System.in);
		System.out.println("Toplam tutar� giriniz..");
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
		String mesaj = "Kazan�lan Tutar "+puan +"TL dir. Tutar� K�z�lay Derne�ine ba���lamk ister misiniz?"; // Verilecek Mesaj
		String mesaj2 ="Toplamda "+puan+" TL ba��s yapt�n�z. Te�ekk�r ederiz.";
		String baslik = "Uyar�"; // Pencere Ba�l���
		int cevap = JOptionPane.showOptionDialog(null, mesaj, baslik, JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE , null, bagisOption, null);
		if(cevap==JOptionPane.YES_OPTION)//Kullan�c� Evet butonuna basm��sa 
		{
			JOptionPane.showOptionDialog(null, mesaj2, baslik, JOptionPane.CLOSED_OPTION, JOptionPane.OK_OPTION, null, cikisOption, null);
		}

	}

}
