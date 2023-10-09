package vetor;
import java.util.Scanner;
public class Atividade4 {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double[] vetor = new double[10];

			for (int i = 0; i < 10; i++) {
				System.out.print("Digite o " + (i + 1) + "º número real: ");
				vetor[i] = scanner.nextDouble();
			}scanner.close();

			System.out.print("Elementos nas posições pares do vetor: ");
			for (int i = 0; i < 10; i += 2) {
				System.out.print(vetor[i] + " ");
			}
			System.out.println();

			
		}
	

}
       

      