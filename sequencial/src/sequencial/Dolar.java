package sequencial;

import javax.swing.JOptionPane;
public class Dolar {

	public static void main(String[] args) {
		String cotacaoStr = JOptionPane.showInputDialog(null, "Digite a cotação atual do dólar em reais:");
		double cotacao = Double.parseDouble(cotacaoStr);
		
		String valordolarStr = javax.swing.JOptionPane.showInputDialog("Digite o valor em dólares:");
		double valordolar =- Double.parseDouble(valordolarStr);
		
		double real = valordolar * cotacao;
		
		JOptionPane.showMessageDialog(null, "O valor em reais é : R$" + real);
		
		System.exit(0);
		System.exit(0);

	}

}