package bolum3;

import java.util.Scanner;

/**
 * @author nursen.eyupoglu
 *
 */
//C�mledeki bo�luklar� bulan program
public class Soru12 {

	public static void main(String[] args) {
		int bosluk=0,uzunluk=0;//cumledeki bosluk say�s�
		String cumle = "";
		Scanner giris = new Scanner (System.in);
		System.out.println("Bir cumle yaz�n�z..");
		cumle =giris.nextLine();
		uzunluk = cumle.trim().length();
		for(int i =0;i <uzunluk;i++)//cumlenin uzunlu�una g�re d�necek
		{
			int boslukVarMi = cumle.indexOf(" ");
			if(boslukVarMi != -1)
			{
			bosluk ++;
			cumle=cumle.trim().substring(boslukVarMi+1);//bosluktan sonraki karakterden itibaren yeni cumle 
			uzunluk = cumle.length();
			}
		}
		System.out.println("Cumlenizdeki bo�luk say�s�: " +bosluk);

	}

}
