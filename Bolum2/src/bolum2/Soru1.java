package bolum2;
//Klavyeden girilen 2 sayýya dört iþlemin uygulanmasýdýr
import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
	int a,b;
	Scanner giris = new Scanner(System.in);
	System.out.println("Klavyeden iki adet deðer giriniz");
	System.out.println("Ýlk sayýyý giriniz: ");
	a=giris.nextInt();
	System.out.println("0 dan farklý bir sayý giriniz: ");
	b=giris.nextInt();
	giris.close();
	System.out.println("TOPLAMA ÝÞLEMÝ: " +(a+b));
	System.out.println("ÇIKARMA ÝÞLEMÝ: " +(a-b));
	System.out.println("ÇARPMA ÝÞLEMÝ: " +(a*b));
	System.out.println("BÖLME ÝÞLEMÝ: " +(a+b));
	}

}
