package bolum3;

import java.util.Scanner;

//Müþterilerin indirim tutarýnýn hesaplanmasý
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
			System.out.println("Müsterinin Alýþveriþ Tutarýný Giriniz.");
			System.out.println("Programdan çýkýþ için negatif tutar girebilirsiniz.");
			
			musteriTutar = giris.nextDouble(); //müsterinin ödeyeceði tutarýn hesaplanmasý

			if(musteriTutar < 0)
			{
				System.out.println("Program kapatýlýyor..");
				break;
			}
			else if(musteriTutar <= 10)
			{
				indirimYuzdesi =(int) musteriTutar / 2;
				indirimTutar= musteriTutar * (indirimYuzdesi * 1.0/ 100.0);
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("Müþterinin ödemesi gereken tutar:");
				System.out.println(musteriTutar);
				
			}
			else if(musteriTutar>10 && musteriTutar<=20)
			{
				indirimYuzdesi = (int) musteriTutar / 2;
				indirimTutar= musteriTutar * (indirimYuzdesi * 2.0 / 100.0);
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("Müþterinin ödemesi gereken tutar:");
				System.out.println(musteriTutar);
			}
			else if (musteriTutar >20)
			{
				indirimTutar= musteriTutar  * 25.0 / 100.0;
				musteriTutar = musteriTutar - indirimTutar; 
				System.out.println("Müþterinin ödemesi gereken tutar:");
				System.out.println(musteriTutar);
				
			}
		}
		giris.close();
		

	}

}
