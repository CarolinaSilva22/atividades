package psc;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		Retangulo ret = new Retangulo();
		Scanner input = new Scanner(System.in);
	
		System.out.print("Informe a altura do retângulo: ");
		ret.setAltura(input.nextFloat());
		/** o metodo setAltura é invocado e incrementrado valor digitado*/
		
		System.out.print("Informe a largura do retângulo: ");
		ret.setLargura(input.nextFloat());
		/**o metodo setLargura é invocado e incrementrado valor digitado*/
		
		System.out.println("Informações: " + ret.exibir());
		/**Retorna metodo exibir */
	}
}