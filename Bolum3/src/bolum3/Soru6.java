package bolum3;
//Fibonacci serisinin hesaplanmas�
/**
 * @author nursen.eyupoglu
 *
 */
public class Soru6 {

	public static void main(String[] args) {
		System.out.println("1000den k���k Fibonacci say�lar�:");
		int ilkSayi = 1, ikinciSayi =0, toplam;
		//fibonacci say�lar�n�n hesaplanmas�
		do{
		toplam = ikinciSayi + ilkSayi;
		//fibonacci toplam� 1000den b�y�kse program k�r�l�yor
		if(toplam>1000)
			break;
		ilkSayi = ikinciSayi;
		ikinciSayi = toplam;
		System.out.print(toplam + " ");
		}while(toplam<1000);
	}

}
