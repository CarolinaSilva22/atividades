package sequencial;
import java.util.Scanner;
public class Hipotenusa {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Digite o valor do cateto A: ");
		double catetoA = input.nextDouble();
		
		System.out.println("Digite o valor do cateto B: ");
		double catetoB = input.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		System.out.println("Valor da hipotenusa: " + hipotenusa);
		input.close();
		System.exit(0);
	}

}