package bolum4;

import java.text.DecimalFormat;

public class TurkishNumberToWords {

	private static final String[] onlarBasamagi = { "", " on", " yirmi", " otuz", " kırk", " elli", " altmış",
			" yetmiş", " seksen", " doksan" };

	private static final String[] sayilar = { "", " bir", " iki", " üç", " dört", " beş", " altı", " yedi", " sekiz",
			" dokuz", " on", " on bir", " on iki", " on üç", " on dört", " on beş", " on altı", " on yedi", " on sekiz",
			" on dokuz" };

	private TurkishNumberToWords() {
	}

	private static String ucBasamakli(int sayi) {
		String sonuc;

		if (sayi % 100 < 20) {
			sonuc = sayilar[sayi % 100];
			sayi /= 100;
		} else {
			sonuc = sayilar[sayi % 10];
			sayi /= 10;

			sonuc = onlarBasamagi[sayi % 10] + sonuc;
			sayi /= 10;
		}
		if (sayi == 0) {
			return sonuc;
		} else if (sayi == 1) {
			return "yüz" + sonuc;
		}
		return sayilar[sayi] + " yüz" + sonuc;
	}

	public static String donusum(long deger) {
		// 0 to 999 999 999 999
		if (deger == 0) {
			return "sıfır";
		}

		String snumber = Long.toString(deger);

		// pad with "0"
		String maske = "000000000000";
		DecimalFormat df = new DecimalFormat(maske);
		snumber = df.format(deger);

		// XXXnnnnnnnnn
		int milyar = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int milyon = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int binlerBas = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int yüzlerBas = Integer.parseInt(snumber.substring(9, 12));

		String milyarBasamagi;
		switch (milyar) {
		case 0:
			milyarBasamagi = "";
			break;
		case 1:
			milyarBasamagi = ucBasamakli(milyar) + " milyar ";
			break;
		default:
			milyarBasamagi = ucBasamakli(milyar) + " milyar ";
		}
		String result = milyarBasamagi;

		String milyonBasamagi;
		switch (milyon) {
		case 0:
			milyonBasamagi = "";
			break;
		case 1:
			milyonBasamagi = ucBasamakli(milyon) + " milyon ";
			break;
		default:
			milyonBasamagi = ucBasamakli(milyon) + " milyon ";
		}
		result = result + milyonBasamagi;

		String binlerBasamagi;
		switch (binlerBas) {
		case 0:
			binlerBasamagi = "";
			break;
		case 1:
			binlerBasamagi = "bin ";
			break;
		default:
			binlerBasamagi = ucBasamakli(binlerBas) + " bin ";
		}
		result = result + binlerBasamagi;

		String yuzlerBasamagi;
		yuzlerBasamagi = ucBasamakli(yüzlerBas);
		result = result + yuzlerBasamagi;

		// fazla alanları kaldır
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	/**
	 * testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TurkishNumberToWords turk = new TurkishNumberToWords();
		System.out.println("*** " + turk.donusum(0));
		System.out.println("*** " + turk.donusum(1));
		System.out.println("*** " + turk.donusum(16));
		System.out.println("*** " + turk.donusum(20));
		System.out.println("*** " + turk.donusum(100));
		System.out.println("*** " + turk.donusum(191));
		System.out.println("*** " + turk.donusum(118));
		System.out.println("*** " + turk.donusum(200));
		System.out.println("*** " + turk.donusum(219));
		System.out.println("*** " + turk.donusum(800));
		System.out.println("*** " + turk.donusum(801));
		System.out.println("*** " + turk.donusum(1316));
		System.out.println("*** " + turk.donusum(1000000));
		System.out.println("*** " + turk.donusum(2000000));
		System.out.println("*** " + turk.donusum(3000200));
		System.out.println("*** " + turk.donusum(700000));
		System.out.println("*** " + turk.donusum(9000000));
		System.out.println("*** " + turk.donusum(9001000));
		System.out.println("*** " + turk.donusum(123456789));
		System.out.println("*** " + turk.donusum(2147483647));
		System.out.println("*** " + turk.donusum(3000000010L));

	}
}
