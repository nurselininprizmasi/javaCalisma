package bolum3;
/*Kaynak olarak kullanýlan adres:
 * http://www.hasanunlukilinc.com/java-optiondialog-kullanimi/
 */
import javax.swing.JOptionPane;

public class MesajDiyalog {

	public static void main(String[] args) {
		int sayi1 = (int)(Math.random()*9)+1;
		int sayi2 = (int)(Math.random()*9)+1;
		if(sayi1 < sayi2)
        {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }
		JOptionPane.showMessageDialog(null, "Sorun geliyor", "Selam", JOptionPane.INFORMATION_MESSAGE);
        int cevap = Integer.parseInt(JOptionPane.showInputDialog(null, sayi1+" - "+sayi2+" = ?", "Cevapla", JOptionPane.QUESTION_MESSAGE));
        if(cevap==sayi1-sayi2)
        {
            JOptionPane.showMessageDialog(null, "Dogru", "Cevap", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Yanlis", "Cevap", JOptionPane.ERROR_MESSAGE);
        }
         
        int memnun = JOptionPane.showConfirmDialog(null, "Memnun kaldinmi ?", "Anket", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(memnun==0)
        {
            JOptionPane.showMessageDialog(null, "Tesekkur ederim :)", "Burak", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cokta umrumdaydin :D", "Burak", JOptionPane.ERROR_MESSAGE);
        }
	}

}
