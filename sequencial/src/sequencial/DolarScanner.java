package sequencial;

import java.util.Scanner;

public class DolarScanner {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a cotacao do dolar em reais: ");
	        double cotacao = input.nextDouble();

	        System.out.print("Digite o valor em dolares: ");
	        double valorDolar = input.nextDouble();

	        // Converte o valor em dólares para reais
	        double valorEmReais = valorDolar * cotacao;

	        // Exibe o valor em reais
	        System.out.println("O valor em reais é: R$" + valorEmReais);

	        input.close();
	        System.exit(0);
	    }
	}