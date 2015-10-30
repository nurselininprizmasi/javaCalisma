package bolum2;
// �Al��sanlar�n g�nl�k �cretinin hesaplanmas�
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Soru9 {
	static final double VERGI = 0.25;
	static double gunlukUcret = 0.0;
	public static void main(String[] args) {
		double brutUcret;
		int calismaSuresi;
		Scanner giris = new Scanner(System.in);
		System.out.println("Personel br�t �cretini giriniz..");
		brutUcret = giris.nextDouble();
		System.out.println("G�nl�k �al��ma s�resini giriniz..");
		calismaSuresi = giris.nextInt();
		giris.close();
		ucrethesapla(brutUcret,calismaSuresi);	
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(frame,gunlukUcret,"Personel G�nl�k �creti",-1);		
	}

	private static void ucrethesapla(double brutUcret, int calismaSuresi) {
		
		gunlukUcret = calismaSuresi * brutUcret * (1.0-VERGI);
	
	}

}
