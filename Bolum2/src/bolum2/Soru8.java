package bolum2;

import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		int[] sayilar = new int [3];
		Scanner giris = new Scanner(System.in);
		System.out.println("Klavyeden 3 tam say� giriniz.. !!");
		sayilar[0] = giris.nextInt();
		sayilar[1] = giris.nextInt();
		sayilar[2] = giris.nextInt();
		giris.close();
		System.out.println("Girilen say�lar�n tersten g�sterimi:");
		for (int i = 2; i >= 0 ;i--) {
			System.out.print(sayilar[i]+"  ");
		}
		
	}

}
