package bolum3;
//Fibonacci serisinin hesaplanmasý
/**
 * @author nursen.eyupoglu
 *
 */
public class Soru6 {

	public static void main(String[] args) {
		System.out.println("1000den küçük Fibonacci sayýlarý:");
		int ilkSayi = 1, ikinciSayi =0, toplam;
		//fibonacci sayýlarýnýn hesaplanmasý
		do{
		toplam = ikinciSayi + ilkSayi;
		//fibonacci toplamý 1000den büyükse program kýrýlýyor
		if(toplam>1000)
			break;
		ilkSayi = ikinciSayi;
		ikinciSayi = toplam;
		System.out.print(toplam + " ");
		}while(toplam<1000);
	}

}
