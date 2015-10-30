package bolum3;

import java.util.Scanner;

//Fahrenheit - Celcius // Celcius - Fahrenheit 
//Donüsüm formüllerinin kullanýlmasý
public class Deneme1 {

	public static void main(String[] args) {
		double celcius ,fahrenheit;
		char secim;
		Scanner giris = new Scanner(System.in);
		System.out.println("Fahrenheit - Celcius dönüþümü için F giriniz..");
		System.out.println("Celcius - Fahrenheit dönüþümü için C giriniz..");
		secim = giris.next().trim().charAt(0);
		giris.close();
		switch (secim) {
		case 'c':
		case 'C':
			System.out.println("Fahrenheit deðeri giriniz..");
			fahrenheit = giris.nextDouble();
			celcius = 5.0 / 9.0 * (fahrenheit - 32.00);
			System.out.println("Celcius deðeri: " +Math.round(celcius));
			break;
		case 'f':
		case 'F':
			System.out.println("Celcius deðeri giriniz..");
			celcius = giris.nextDouble();
			fahrenheit = ( 9.0 * celcius /5.0) + 32.00;
			System.out.println("Fahrenheit deðeri: " +Math.round(fahrenheit));
			break;
		}

	}

}
