package bolum3;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
//Form�l de�eri hesaplama
public class Soru8 {

	public static void main(String[] args) {
		double fx=0.0,gx=0.0;
		double sayi;
		Scanner giris = new Scanner(System.in);
		System.out.println("Say� giriniz..");
		sayi = giris.nextDouble();
		giris.close();
		if (sayi > 0) {
			fx = 1.0 / (1.0 + sayi);
			gx = 1.0 / (sayi + Math.pow(sayi,2));
		} else if(sayi <= 0) {
			fx = 1.0 / (1.0 + Math.pow(sayi, 2));
			gx = 1.0 / (1.0+ sayi + Math.pow(sayi,2)+Math.pow(sayi,3));
		}
		System.out.println(" f(" +sayi+ ") de�eri =" +fx);
		System.out.println(" g(" +sayi+ ") de�eri =" +gx);
	}

}
