package bolum1;

public class Soru4 {
	
	public static void main(String[] args) {
		int boyut = 7;
		int i,j,k,l;
		for (i=1; i <= boyut; i++)
		{
			System.out.print("*");
			if(i<=boyut/2)
				k= 2*i-1; //aradaki bo�luk say�s�
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki bo�luk say�s�
				}
		 j = (boyut - k) / 2; //y�ld�z say�s�
		 
		 
		//baklava deseni burada olu�turulmaya ba�lan�l�yor.
		for (l = 0; l <j; l++) //ba�lang�ca bo�luk ekleme
		System.out.print(" ");
		
		for (l = 0; l <k; l++)
		if(l == 0 || l == (k - 1))
		System.out.print("*");
		else
		System.out.print(" ");
		
		for (l = 0; l < j; l++) //biti�e bo�luk ekleme
		System.out.print(" ");
		System.out.println("*");
		}
		

	}

}
