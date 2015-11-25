package bolum4;

/**
 * @author nursen.eyupoglu
 *
 */
public class KesirliSayi {
	private int pay;
	private int payda;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay1) {
		pay = pay1;
	}

	public int getPayda() {
		return payda;
	}

	public void setPayda(int pay2) {
		pay = pay2;
	}

	public KesirliSayi topla(KesirliSayi sayi1) {
		KesirliSayi sayi2 = new KesirliSayi(); // kesirli sayi sınıfından nesne
												// oluşturuluyor
		sayi2.pay = sayi1.pay * payda + pay * sayi1.payda;
		sayi2.payda = sayi1.payda * payda;
		return sayi2; // nesne dödürülüyor
	}

	public void yazdir() {
		System.out.println(pay +"/"+payda);
	}
}
