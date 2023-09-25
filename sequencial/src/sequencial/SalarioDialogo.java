package sequencial;

import javax.swing.JOptionPane;
public class SalarioDialogo {

	public static void main(String[] args) {
		String salarioStr = JOptionPane.showInputDialog("Insira aqui o valor de seu salario:");
		double salario = Double.parseDouble(salarioStr);
		
		double taxa = 0.25;
		
		double aumento = salario * taxa;
		
		double salarionovo = salario + aumento;
		
		JOptionPane.showMessageDialog(null, "O novo salario é R$" + salarionovo);
		
		System.exit(0);
		System.exit(0);		
				
	
	}

}