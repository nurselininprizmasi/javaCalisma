package bolum4;

// get set metodlar�n�n kullan�lmas�
public class BankaHesabi {
	private double hesapBakiyesi;

	public double getHesapBakiyesi() {
		return hesapBakiyesi;
	}

	public void setHesapBakiyesi(double hesapBakiyesi) {
		this.hesapBakiyesi = hesapBakiyesi;
	}

	public double paraCek(double cekilenMiktar) {
		double bakiye = hesapBakiyesi;
		if (cekilenMiktar < bakiye) {// bakiye �ekilen miktar kontrol�
			bakiye -= cekilenMiktar;
			hesapBakiyesi = bakiye;
		} else {
			System.out.println("Yetersiz Bakiye!!!");
			System.exit(0);
		}
		return hesapBakiyesi;
	}
}
