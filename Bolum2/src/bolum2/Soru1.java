package bolum2;
//Klavyeden girilen 2 say�ya d�rt i�lemin uygulanmas�d�r
import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
	int a,b;
	Scanner giris = new Scanner(System.in);
	System.out.println("Klavyeden iki adet de�er giriniz");
	System.out.println("�lk say�y� giriniz: ");
	a=giris.nextInt();
	System.out.println("0 dan farkl� bir say� giriniz: ");
	b=giris.nextInt();
	giris.close();
	System.out.println("TOPLAMA ��LEM�: " +(a+b));
	System.out.println("�IKARMA ��LEM�: " +(a-b));
	System.out.println("�ARPMA ��LEM�: " +(a*b));
	System.out.println("B�LME ��LEM�: " +(a+b));
	}

}
