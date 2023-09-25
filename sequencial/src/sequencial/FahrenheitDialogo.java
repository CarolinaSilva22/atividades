package sequencial;

import javax.swing.JOptionPane;
public class FahrenheitDialogo {

	public static void main(String[] args) {
		String celsiusStr = JOptionPane.showInputDialog("Insira aqui a temperatura em Celsius: ");
		double celsius = Double.parseDouble(celsiusStr);
		
		double taxa = 1.8;
		
		double fahrenheit = celsius * taxa + 32 ;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " + fahrenheit + "F");
		System.exit(0);

	}

}