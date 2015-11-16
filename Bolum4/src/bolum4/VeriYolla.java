package bolum4;

/**
 * @author nursen.eyupoglu
 *
 */
//this parametresinin kullanýmý
public class VeriYolla {

	public String mesaj;
	public int veriYazdýr()
	{
		int say;
		System.out.println("Gelen mesaj:" +this.mesaj);
		say = mesaj.length();
		return say;
	}

}
