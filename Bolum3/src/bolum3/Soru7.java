package bolum3;

import java.util.Scanner;

//M��terilerin indirim tutar�n�n hesaplanmas�
/**
 * @author nursen.eyupoglu
 *
 */
public class Soru7 {

	public static void main(String[] args) {
		double musteriTutar,indirimTutar;
		int indirimYuzdesi;
		Scanner giris = new Scanner(System.in);
		while(1==1)
		{
			System.out.println("M�sterinin Al��veri� Tutar�n� Giriniz.");
			System.out.println("Programdan ��k�� i�in negatif tutar girebilirsiniz.");
			
			musteriTutar = giris.nextDouble(); //m�sterinin �deyece�i tutar�n hesaplanmas�

			if(musteriTutar < 0)
			{
				System.out.println("Program kapat�l�yor..");
				break;
			}
			else if(musteriTutar <= 10)
			{
				indirimYuzdesi =(int) musteriTutar / 2;
				indirimTutar= musteriTutar * (indirimYuzdesi * 1.0/ 100.0);
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("M��terinin �demesi gereken tutar:");
				System.out.println(musteriTutar);
				
			}
			else if(musteriTutar>10 && musteriTutar<=20)
			{
				indirimYuzdesi = (int) musteriTutar / 2;
				indirimTutar= musteriTutar * (indirimYuzdesi * 2.0 / 100.0);
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("M��terinin �demesi gereken tutar:");
				System.out.println(musteriTutar);
			}
			else if (musteriTutar >20)
			{
				indirimTutar= musteriTutar  * 25.0 / 100.0;
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("M��terinin �demesi gereken tutar:");
				System.out.println(musteriTutar);
				
			}
		}
		giris.close();
		

	}

}
