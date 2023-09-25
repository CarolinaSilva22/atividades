package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();

		System.out.print("Quantos funcionários deseja cadastrar? ");
		int quantidadeFuncionarios = scanner.nextInt();

		scanner.nextLine(); // Limpa o buffer do teclado

		for (int i = 0; i < quantidadeFuncionarios; i++) {
		System.out.println("Cadastro do funcionário " + (i + 1));

		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer do teclado

		System.out.print("Cargo: ");
		String cargo = scanner.nextLine();

		System.out.print("Salário: ");
		double salario = scanner.nextDouble();

        scanner.nextLine(); // Limpa
	}
	}
}
