package bolum4;

/**
 * @author nursen.eyupoglu
 *
 */
//this parametresinin kullanımı
public class VeriYolla {

	public String mesaj;
	public int veriYazdır()
	{
		int say;
		System.out.println("Gelen mesaj:" +this.mesaj);
		say = mesaj.length();
		return say;
	}

}
