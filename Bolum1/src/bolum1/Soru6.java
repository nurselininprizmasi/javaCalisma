package bolum1;

public class Soru6 {

	public static void main(String[] args) {
		int i;
		String [] menu ={"Veri Gir", "S�rala", "G�ster","��k��"};
				
		//�st �izgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
		}
		System.out.println();
		//Men� yazd�r�lmas�
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
			System.out.print("�");
			System.out.print(" ");
			}
		}
		System.out.println();
		//orta �izgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
			}
			System.out.println();
		//Liste yazd�r�lmas�
		for (i=0;i<4;i++)	
		{
			System.out.println((i+1)+"."+"\t"+menu[i]);
		}
		//alt �izgi
		for (i = 1; i < 26; i++) {
			System.out.print("-");
			}
			System.out.println();
		}
	}
