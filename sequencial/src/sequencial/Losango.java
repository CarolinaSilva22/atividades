package sequencial;

import java.util.Scanner;

public class Losango {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Insira aqui a diagonal maior de seu losangulo:");
		double maior = input.nextDouble();
		
		System.out.println("Insira aqui a diagonal menor de seu losangulo:");
		double menor = input.nextDouble();
		
		double area = maior * menor / 2;
		
		System.out.println("O valor da area e:" + area);
	
		System.exit(0);
	}

}