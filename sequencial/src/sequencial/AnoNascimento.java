package sequencial;

import java.util.Scanner;

public class AnoNascimento {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.print("Digite o ano atual:");
		int anoAtual = input.nextInt();
		
		int idadeAtual = anoAtual - anoNascimento;
		
		int ano2050 = 2050;
		int idade2050 = ano2050 - anoNascimento;
		
		System.out.println("Idade atual: " + idadeAtual + "anos.");
		System.out.println("Idade em 2050: " + idade2050 + "anos.");
		
		input.close();
		System.exit(0);
	}
}

	