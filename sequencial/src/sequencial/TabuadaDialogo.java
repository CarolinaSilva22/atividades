package sequencial;

import javax.swing.JOptionPane;

public class TabuadaDialogo {

	public static void main(String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Informe o numero para taboada");
		int numero = Integer.parseInt(numeroStr);

		StringBuilder tabuada = new StringBuilder();
		for (int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			tabuada.append(numero).append(" X ").append(i).append(" = ").append(resultado).append("\n");
			 JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
			 
		}

	}

}