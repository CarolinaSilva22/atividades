package sequencial;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira aqui o valor de seu salario: ");
		double salario = input.nextDouble();
		
		System.out.println("Insira aqui o valor do salario minimo: ");
		double minimo = input.nextDouble();
		
		double numerosalarios = salario / minimo;
		
		System.out.printf("O funcionario recebe %.2f salarios minimos. %n", numerosalarios);
		
		input.close();
		System.exit(0);


	}

}