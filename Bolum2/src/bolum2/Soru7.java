package bolum2;

import java.util.Scanner;

// Fahrenheit - Celcius d�n���m form�l�n�n uygulanmas�
//FORM�L
// ****C = 5/9 (F-32)****
public class Soru7 {

	public static void main(String[] args) {
		int celcius;
		int fahrenheit;
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir F de�eri giriniz; ");
		fahrenheit = giris.nextInt();
		giris.close();
		celcius = (int) Math.ceil((5.0 /9.0) * (fahrenheit -32));
				System.out.println("D�n���m sonucunda bulununan C de�eri: " + celcius);
	}

}
