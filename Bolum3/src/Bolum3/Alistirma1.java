package Bolum3;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {
		int i,j,k;
		int boyut;
		Scanner giris = new Scanner(System.in);
		System.out.println("Boyut giriniz..");
		boyut= giris.nextInt();
		giris.close();
	//3 boyutlu kare
	for( i=1; i<=boyut ; i++)
	{
		for(j=1;j <=boyut; j++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
	//artan yýldýz
	for(i=1; i<=boyut; i++){
		for(j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	//baklava deseni
	for(i=1;i<= boyut;i++)
	{

		if(i <= boyut/2)
			k = 2 * i - 1; // yýldýz sayýsý
		else
			k= 2 * (boyut - i + 1) - 1; // yýldýz sayýsý
		
		int bosluk = (boyut-k) / 2; //bosluk sayýsý
		
			for (int l = 0; l< bosluk; l++)
			{
				System.out.print(" ");
			}
			for(int l = 1; l<= k; l++)
			{
			System.out.print("*");
			}
			System.out.println();
	}
}
}