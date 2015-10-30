package bolum1;

public class Soru6 {

	public static void main(String[] args) {
		int i;
		String [] menu ={"Veri Gir", "Sýrala", "Göster","Çýkýþ"};
				
		//üst çizgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
		}
		System.out.println();
		//Menü yazdýrýlmasý
		for (i = 1; i < 20; i++) {
		System.out.print(" ");
		if(i==6){
		System.out.print("M");
		System.out.print(" ");
		}
		if(i==8){
			System.out.print("e");
			System.out.print(" ");
			}
		if(i==10){
			System.out.print("n");
			System.out.print(" ");
			}
		if(i==12){
			System.out.print("ü");
			System.out.print(" ");
			}
		}
		System.out.println();
		//orta çizgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
			}
			System.out.println();
		//Liste yazdýrýlmasý
		for (i=0;i<4;i++)	
		{
			System.out.println((i+1)+"."+"\t"+menu[i]);
		}
		//alt çizgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
			}
			System.out.println();
		}
	}
