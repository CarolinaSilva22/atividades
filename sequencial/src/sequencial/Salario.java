package sequencial;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira aqui o valor de seu salario: ");
		double salario = input.nextDouble();
		
		double taxa = 0.25;
		
		double aumento = salario * taxa;
		
		double salarionovo = salario + aumento;
		
		System.out.println("O salario novo e R$" + salarionovo);
		
		System.exit(0);
		System.exit(0);
		
		
	}

}