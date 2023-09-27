package banco;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;

	public void iniciarContaCorrente(int n, int ag) {
		/**Atributos*/
		numero = n;
		agencia = ag;
		saldo = 0;
	
	}
	
	/**Metodos*/
	public void sacar(double valor) {
		if(saldo>valor) {
		saldo = saldo - valor;
		}
		else {
			System.out.println("Valor maior que o saldo!!");
			}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return (saldo);
	}
	
	public String exibir() {
			String info = "\nNumero: " + numero + " - Agencia: " + agencia + "\nSaldo: "+saldo;
			return(info);
		}
	
}