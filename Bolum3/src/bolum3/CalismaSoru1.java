package bolum3;
//Maht fonksiyonlar�n�n kullan�lmas�
import java.util.Scanner;

public class CalismaSoru1 {

	public static void main(String[] args) {
		double sonuc;
		double x;
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir X tam say�s� giriniz");
		x = giris.nextDouble();
		giris.close();
		//Mutlak deger abs() methodunun kullan�lmas�
		if (x < 0) {
			sonuc = (2.0 / 3.0 )* (Math.abs(x - 1.0));
			System.out.println("f("+x+") degeri:  "+sonuc);
		} 
		// K�k de�eri hesaplama Math.sqrt() methodunun kullan�lmas�
		else if (x == 0) {
			sonuc = Math.sqrt(2.0 /3.0); 
			System.out.println("f("+x+") degeri:  "+sonuc);
		}
		else if(x > 0){
			sonuc = (2.0 / 3.0 ) * Math.abs( x + 1.0);
			System.out.println("f("+x+") degeri:  "+sonuc);
		}
	}

}
