package bolum3;

import java.util.Scanner;

public class LaboratuvarCalisma2 {

	public static void main(String[] args) {
		String s1,s2;
		Scanner giris = new Scanner(System.in);
		System.out.println("ilk metni giriniz: ");
		s1 = giris.nextLine();
		System.out.println("ikinci metni giriniz: ");
		s2 = giris.nextLine();
		giris.close();
		if(s1.equals(s2))
		{
			System.out.println("iki metin birbirinin ayn�d�r.");
		}
		else
			System.out.println("iki metin birbirinden farkl�d�r");
		if(s2.equals(s1))
		{
			System.out.println("iki metin birbirinin ayn�d�r");
		}
		else
			System.out.println("iki metin birbirinden farkl�d�r");

	}

}
