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
System.out.println("B�l�m = "+bolum);
System.out.println("Kalan= "+kalan);
//soru 11
double sonuc2 ;
sonuc2 = (1/2)*2;
System.out.println("(1/2) * 2 e�ittir " +sonuc2);
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
String c1 ="Merhaba D�nya";
String c2 ="merhaba d�nya";
	if(c1.equals(c2))
		System.out.println("E�ittir");
	else if (c1.equalsIgnoreCase(c2))
		System.out.println("E�ittir");
	else
	System.out.println("E�it de�ildir");
JOptionPane.showMessageDialog(null, "Deneme", "Uyar�", -1);
	
}
}