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
	//üst baklava deseni
	if(tip==1) {
		for (i=1; i <= boyut -3 ; i++)
		{
			if(i<=boyut/2)
				k= 2*i-1; //aradaki boşluk sayısı
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki boşluk sayısı
				}
		 j = (boyut - k) / 2; //yıldız sayısı
		 
		 if (j==0){ // orta kısma gelme
				 System.out.print("  ");
			 for (l = 0; l < 2*k; l++)
				 if(l == 0 || l == 2*(k-3))
				 System.out.print("****");
				 else
				 System.out.print(" ");
			 
				 System.out.println();}
				 else{
					//baklava deseni burada oluşturulmaya başlanılıyor.
					for (l = 0; l < 3*j; l++) //başlangıca boşluk ekleme
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
				k= 2*i-1; //aradaki boşluk sayısı
				else {
					k= 2 * (boyut -i +1) - 1; //aradaki boşluk sayısı
				}
		 j = (boyut - k) / 2; //yıldız sayısı
		 
		//baklava deseni burada oluşturulmaya başlanılıyor.
		for (l = 0; l < 3*j; l++) //başlangıca boşluk ekleme
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
			k= 2*i-1; //aradaki boşluk sayısı
			else {
				k= 2 * (boyut -i +1) - 1; //aradaki boşluk sayısı
			}
	 j = (boyut - k) / 2; //yıldız sayısı
	 
	 
	//baklava deseni burada oluşturulmaya başlanılıyor.
	for (l = 0; l < 3*j; l++) //başlangıca boşluk ekleme
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