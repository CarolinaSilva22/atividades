package condicional;
import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um valor numerico:");
		double x = input.nextDouble();

		if (x < -2) {
			x = 2 * x + 2;
			System.out.println("O numero é menor que -2.");
			System.out.println("Resultado de 2x+2: " + x);
	
		}else if(-2 <= x && x < 3){
			x = 3;
			System.out.println("O numero é maior ou igual a -2 e menos que 3.");
			System.out.println("Resultado x = 3: " + x);
	
		}else if(x >= 3) {
			x = -x;
			System.out.println("O numero é maior ou igual a 3.");
			System.out.println("Resultado x = -x: " + x);
		}
	}
}

