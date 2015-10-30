package bolum2;

import java.util.Scanner;

// Fahrenheit - Celcius dönüþüm formülünün uygulanmasý
//FORMÜL
// ****C = 5/9 (F-32)****
public class Soru7 {

	public static void main(String[] args) {
		int celcius;
		int fahrenheit;
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir F deðeri giriniz; ");
		fahrenheit = giris.nextInt();
		giris.close();
		celcius = (int) Math.ceil((5.0 /9.0) * (fahrenheit -32));
				System.out.println("Dönüþüm sonucunda bulununan C deðeri: " + celcius);
	}

}
