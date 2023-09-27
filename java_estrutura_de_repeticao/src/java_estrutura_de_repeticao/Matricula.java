package java_estrutura_de_repeticao;

import java.util.Scanner;

public class Matricula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Informe as matriculas dos alunos (1 por vez): ");
			int matricula = input.nextInt();
			if (matricula < 0) {
				break;
			}
			System.out.println("Informe a primeria nota: ");
			double nota1 = input.nextDouble();
			
			System.out.println("Informe a segunda nota: ");
			double nota2 = input.nextDouble();
			
			System.out.println("Informe a terceira nota: ");
			double nota3 = input.nextDouble();
			
			double media = (nota1 + nota2 + nota3) / 3.0;
			
			String situacao;
			if (media >= 70) {
				situacao = "Aprovado";
			} else if (media >= 60) {
				situacao = "Recuperacao";
			} else {
				situacao = "Reprovado";
			}
			System.out.println("Matricula: " + matricula);
			System.out.println("Media: " + String.format("%2f", media));
			System.out.println("Situacao: " + situacao);
			System.out.println();

		}
		System.out.println("Programa encerrado.");
	}

}
