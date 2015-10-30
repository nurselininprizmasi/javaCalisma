package bolum2;

import javax.swing.JOptionPane;

public class Denemeler {

public static void main(String[] args) {
//soru 8	
char a,b;
a='b';
System.out.println(a); b ='c';
System.out.println(b); a = b;
System.out.println(a);
//soru 9
int sonuc = 10; sonuc +=3;
System.out.println("sonuc: "+sonuc);
//soru 10
int bolum,kalan;
bolum = 7/ 3; kalan = 7 % 3;
System.out.println("Bölüm = "+bolum);
System.out.println("Kalan= "+kalan);
//soru 11
double sonuc2 ;
sonuc2 = (1/2)*2;
System.out.println("(1/2) * 2 eþittir " +sonuc2);
//soru 12
int sonuc3 = 11; sonuc3 +=2;
System.out.println("sonuc: "+sonuc3);
//soru 13
int n = 2; n++;
System.out.println("n== "+n);
n--;
System.out.println("n== "+n);
//soru 18
System.out.println("anc\\ndef");
//soru 20
String c1 ="Merhaba Dünya";
String c2 ="merhaba dünya";
	if(c1.equals(c2))
		System.out.println("Eþittir");
	else if (c1.equalsIgnoreCase(c2))
		System.out.println("Eþittir");
	else
	System.out.println("Eþit deðildir");
JOptionPane.showMessageDialog(null, "Deneme", "Uyarý", -1);
	
}
}