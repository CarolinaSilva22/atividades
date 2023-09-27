package banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ContaCorrente contaCorrente;
		contaCorrente = new ContaCorrente();
		/** cria uma área de memória que é uma referência para um objeto da classe ContaCorrente.
		cria um objeto da classe ContaCorrente e o atribui a contaCorrente. */
		Scanner input = new Scanner(System.in);

		System.out.print("informe o número e a agência: ");
		contaCorrente.iniciarContaCorrente(input.nextInt(), input.nextInt());
		/**o metodo iniciarContaCorrente é invocado */
		
		System.out.print("Valor do deposito: ");
		contaCorrente.depositar(input.nextDouble());
		/**o metodo depositar é invocado */
		
		System.out.println("\nDados da conta após o deposito:" + contaCorrente.exibir());
		
		System.out.print("Valor do saque: ");
		contaCorrente.sacar(input.nextDouble());
		/**o metodo sacar é invocado*/
	
		System.out.println("Dados da conta após o saque:" + contaCorrente.exibir());
		/**Retorna metodo exibir */
		
	}
}