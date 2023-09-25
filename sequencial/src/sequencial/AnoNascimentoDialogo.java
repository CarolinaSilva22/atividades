package sequencial;

import javax.swing.JOptionPane;

public class AnoNascimentoDialogo {
	public static void main(String[] args) {
	
	String nascimentoStr = JOptionPane.showInputDialog("Digite aqui seu ano de nascimento");
	int nascimento = Integer.parseInt(nascimentoStr);
	
	String anoatualStr =  JOptionPane.showInputDialog("Difite aqui o ano atual");
	int anoatual = Integer.parseInt(anoatualStr);
	
	int idadeAtual = anoatual - nascimento;
	
	int ano2050 = 2050;
	int idade2050 = ano2050 - nascimento;
	
	JOptionPane.showMessageDialog(null, "Idade atual: " + idadeAtual + "anos.");
	JOptionPane.showMessageDialog(null, "Idade em 2050: " + idade2050 + "anos.");
	System.exit(0);

	 
	}
}