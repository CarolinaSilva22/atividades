package sequencial;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um numero para a tabuada: ");
		int numero = input.nextInt();
		for (int i = 0; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
			
			
		}
	}
	
}

	
		
		

	
