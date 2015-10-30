package bolum1;

public class Soru4 {
	
	public static void main(String[] args) {
		int boyut = 7;
		int i,j,k,l;
		for (i=1; i <= boyut; i++)
		{
			System.out.print("*");
			if(i<=boyut/2)
				k= 2*i-1; //aradaki boþluk sayýsý
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki boþluk sayýsý
				}
		 j = (boyut - k) / 2; //yýldýz sayýsý
		 
		 
		//baklava deseni burada oluþturulmaya baþlanýlýyor.
		for (l = 0; l <j; l++) //baþlangýca boþluk ekleme
		System.out.print(" ");
		
		for (l = 0; l <k; l++)
		if(l == 0 || l == (k - 1))
		System.out.print("*");
		else
		System.out.print(" ");
		
		for (l = 0; l < j; l++) //bitiþe boþluk ekleme
		System.out.print(" ");
		System.out.println("*");
		}
		

	}

}
