package bolum2;
//Ondalýk toplam hesaplama iþleminin yapýlmasý
//FORMUL:
//*****1/R = 1/R1 + 1/R2 + 1/R3******
public class Soru6 {
	double toplam;
	public static void main(String[] args) {
		double R =0.0;
		int[][] degerR = new int[][]{ //dizinin elemanlarýnýn tanýtýlmasý
						{1,1,1},
						{10,100,1000}};
		double toplam=0.0 ;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				toplam = toplam + (1.0 / degerR[i][j]);
			}
			R = 1/toplam;
			toplam = 0.0;
			System.out.println((i+1)+". döngü sonucu R: " +R);
		}

	}

}
