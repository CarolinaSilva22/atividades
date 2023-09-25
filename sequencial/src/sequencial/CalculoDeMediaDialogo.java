package sequencial;

import javax.swing.JOptionPane;

public class CalculoDeMediaDialogo {
	public static void main(String[] args) {
		String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
		double nota1 = Double.parseDouble(nota1Str);

		String nota2Str = JOptionPane.showInputDialog("Digite a segunda nota:");
		double nota2 = Double.parseDouble(nota2Str);

		String nota3Str = JOptionPane.showInputDialog("Digite a terceita nota:");
		double nota3 = Double.parseDouble(nota3Str);
		double media = (nota1 + nota2 + nota3) / 3;

		JOptionPane.showMessageDialog(null, "A media das notas é:" + media);
		System.exit(0);
		System.exit(0);
	}
}