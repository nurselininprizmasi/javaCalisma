package bolum1;

public class Soru2 {

	public static void main(String[] args) {
		String [] isimler = new String []{"Anýl","Murat","Ali"};
		String [] puanlar = new String []{"AA","BB","CC"};
		int i,j;
		System.out.println("Ýsim\t"+ "Harf Notu\n");
		j=0;
		for(i=0;i<3;i++)
		{			
			System.out.println(isimler[i]+"\t"+ puanlar[j]+"\n");
			j++;
		}
		
		
	}

}
