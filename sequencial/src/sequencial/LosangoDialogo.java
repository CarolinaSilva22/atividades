package sequencial;

import javax.swing.JOptionPane;
public class LosangoDialogo {

	public static void main(String[] args) {
		String maiorStr = JOptionPane.showInputDialog("Insira aqui a maior diagonal de seu losango:");
		double maior = Double.parseDouble(maiorStr);
		String menorStr = JOptionPane.showInputDialog("Insira aqui a menor diagonal de seu losango:");
		double menor = Double.parseDouble(menorStr);
		
		double area = maior * menor / 2;
		
		JOptionPane.showMessageDialog(null,"A area de seu losango e:" + area);
		System.exit(0);
	}

}