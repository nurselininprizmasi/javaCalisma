package bolum4;

/**
 * @author nursen.eyupoglu
 *
 */
//this parametresinin kullan�m�
public class VeriYolla {

	public String mesaj;
	public int veriYazd�r()
	{
		int say;
		System.out.println("Gelen mesaj:" +this.mesaj);
		say = mesaj.length();
		return say;
	}

}
