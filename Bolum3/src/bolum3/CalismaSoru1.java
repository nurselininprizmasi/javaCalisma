package bolum3;
//Maht fonksiyonlarının kullanılması
import java.util.Scanner;

public class CalismaSoru1 {

	public static void main(String[] args) {
		double sonuc;
		double x;
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir X tam sayısı giriniz");
		x = giris.nextDouble();
		giris.close();
		//Mutlak deger abs() methodunun kullanılması
		if (x < 0) {
			sonuc = (2.0 / 3.0 )* (Math.abs(x - 1.0));
			System.out.println("f("+x+") degeri:  "+sonuc);
		} 
		// Kök değeri hesaplama Math.sqrt() methodunun kullanılması
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
