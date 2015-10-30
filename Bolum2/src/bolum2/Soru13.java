package bolum2;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		String cumle;
		Scanner giris = new Scanner(System.in);
		System.out.println(" Boþluk içeren bir cumle giriniz..");
		cumle = giris.nextLine();
		giris.close();
		cumle=cumle.toUpperCase();
		System.out.println(cumle);
		System.out.println("Cümlede yer alan karakter sayýsý  " +cumle.length());
		System.out.println("Ýlk boþluðun bulundupu konum: "+cumle.indexOf(" "));
	}

}
