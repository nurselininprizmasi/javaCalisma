package bolum2;

import java.util.Scanner;

public class Soru13 {
	public static void main(String[] args) {
		String cumle;
		Scanner giris = new Scanner(System.in);
		System.out.println(" Bo�luk i�eren bir cumle giriniz..");
		cumle = giris.nextLine();
		giris.close();
		cumle=cumle.toUpperCase();
		System.out.println(cumle);
		System.out.println("C�mlede yer alan karakter say�s�  " +cumle.length());
		System.out.println("�lk bo�lu�un bulundupu konum: "+cumle.indexOf(" "));
	}

}
