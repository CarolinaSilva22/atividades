package sequencial;
import javax.swing.JOptionPane;
public class PesoDialogo {

	public static void main(String[] args) {
		String pesoatualStr = JOptionPane.showInputDialog("Insira aqui seu peso atual: ");
		double peso = Double.parseDouble(pesoatualStr);
		
		double engordar = peso + (peso * 0.15);
		double emagrecer = peso - (peso * 0.20);
		
		JOptionPane.showMessageDialog(null, "Peso se engordar : " + engordar + "kg.");
		JOptionPane.showMessageDialog(null, "Peso se emagrecer :" + emagrecer + "kg");
		
		System.exit(0);

	}

}