package Bolum3;

import java.util.Scanner;

//Fahrenheit - Celcius // Celcius - Fahrenheit 
//Don�s�m form�llerinin kullan�lmas�
public class Deneme1 {

	public static void main(String[] args) {
		double celcius ,fahrenheit;
		char secim;
		Scanner giris = new Scanner(System.in);
		System.out.println("Fahrenheit - Celcius d�n���m� i�in F giriniz..");
		System.out.println("Celcius - Fahrenheit d�n���m� i�in C giriniz..");
		secim = giris.next().trim().charAt(0);
		giris.close();
		switch (secim) {
		case 'c':
		case 'C':
			System.out.println("Fahrenheit de�eri giriniz..");
			fahrenheit = giris.nextDouble();
			celcius = 5.0 / 9.0 * (fahrenheit - 32.00);
			System.out.println("Celcius de�eri: " +Math.round(celcius));
			break;
		case 'f':
		case 'F':
			System.out.println("Celcius de�eri giriniz..");
			celcius = giris.nextDouble();
			fahrenheit = ( 9.0 * celcius /5.0) + 32.00;
			System.out.println("Fahrenheit de�eri: " +Math.round(fahrenheit));
			break;
		}

	}

}
