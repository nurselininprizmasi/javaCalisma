package bolum1;


public class Baklava {
	int boyut;
	int i,j,k,l;
	public static void main(String[] args) {
		Baklava bak = new Baklava();
		bak.baklavadesen(3);
	}
public void baklavadesen(int tip){
	boyut = 7;
	//�st baklava deseni
	if(tip==1) {
		for (i=1; i <= boyut -3 ; i++)
		{
			if(i<=boyut/2)
				k= 2*i-1; //aradaki bo�luk say�s�
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki bo�luk say�s�
				}
		 j = (boyut - k) / 2; //y�ld�z say�s�
		 
		 if (j==0){ // orta k�sma gelme
				 System.out.print("  ");
			 for (l = 0; l < 2*k; l++)
				 if(l == 0 || l == 2*(k-3))
				 System.out.print("****");
				 else
				 System.out.print(" ");
			 
				 System.out.println();}
				 else{
					//baklava deseni burada olu�turulmaya ba�lan�l�yor.
					for (l = 0; l < 3*j; l++) //ba�lang�ca bo�luk ekleme
					System.out.print(" ");

					for (l = 0; l < 3*k; l++)
					if(l == 0 || l == 3*(k - 1))
					System.out.print("*");
					else
					System.out.print(" ");

					System.out.println();
					}}}
	
	// alt baklava deseni
	else if (tip==2){ 
		for (i=5; i <= boyut; i++)
		{
			if(i<=boyut/2)
				k= 2*i-1; //aradaki bo�luk say�s�
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki bo�luk say�s�
				}
		 j = (boyut - k) / 2; //y�ld�z say�s�
		 
		//baklava deseni burada olu�turulmaya ba�lan�l�yor.
		for (l = 0; l < 3*j; l++) //ba�lang�ca bo�luk ekleme
		System.out.print(" ");

		for (l = 0; l < 3*k; l++)
		if(l == 0 || l == 3*(k - 1))
		System.out.print("*");
		else
		System.out.print(" ");

		System.out.println();
		}
		}
	
	//tam baklava deseni
	else if (tip == 3){

	for (i=1; i <= boyut; i++)
	{
		if(i<=boyut/2)
			k= 2*i-1; //aradaki bo�luk say�s�
			else {
				k= 2 * (boyut -i +1) - 1; //aradaki bo�luk say�s�
			}
	 j = (boyut - k) / 2; //y�ld�z say�s�
	 
	 
	//baklava deseni burada olu�turulmaya ba�lan�l�yor.
	for (l = 0; l < 3*j; l++) //ba�lang�ca bo�luk ekleme
	System.out.print(" ");
	
	for (l = 0; l < 3*k; l++)
	if(l == 0 || l == 3*(k - 1))
	System.out.print("*");
	else
	System.out.print(" ");
	
	System.out.println();
	}
	}
	}}