package sequencial;

import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira aqui a temperatura em graus Celsius:");
		double temperatura = input.nextDouble();

		double taxa = 1.8;

		double fahrenheit = temperatura * taxa + 32;

		System.out.println("A temperatura em Fahrenheit e " + fahrenheit + "F.");
		System.exit(0);

	}

}