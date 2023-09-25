package sequencial;


import javax.swing.JOptionPane;
public class HipotenusaDialogo {

	public static void main(String[] args) {
		String catetoA = JOptionPane.showInputDialog("Insira o valor do cateto A: ");
		double cateto1 = Double.parseDouble(catetoA);
		
		String catetoB = JOptionPane.showInputDialog("Insira o valor do cateto B: ");
		double cateto2 = Double.parseDouble(catetoB);
		
		  double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
		JOptionPane.showMessageDialog(null,"O valor da hipotenusa é: " + hipotenusa);
		System.exit(0);
	}

}