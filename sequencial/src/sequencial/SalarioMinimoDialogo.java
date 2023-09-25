package sequencial;


import javax.swing.JOptionPane;

public class SalarioMinimoDialogo {

	public static void main(String[] args) {
		String salárioStr = JOptionPane.showInputDialog("Insira aqui o valor de seu sálario: ");
		double salario = Double.parseDouble(salárioStr);

		String minimoStr = JOptionPane.showInputDialog("Insira aqui o valor do salario minimo: ");
		double minimo = Double.parseDouble(minimoStr);

		double numerosalarios = salario / minimo;

		JOptionPane.showMessageDialog(null, "O funcionario recebe " + numerosalarios + " salarios minimos.");

		System.exit(0);
		System.exit(0);

	}

}