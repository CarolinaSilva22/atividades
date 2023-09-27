
package java_estrutura_de_repeticao;
import java.util.Scanner;
public class CanalTv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int canal2 = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0;
		int totalPessoas = 0;
		
		while (true) {
			System.out.println("Informe o numero do canal (2, 4, 5, 7, 12) ou o 0 para encerrar: ");
			int numeroCanal = input.nextInt();
			
			if (numeroCanal == 0) {
				break;
			}
			System.out.println("Inform o numero de pessoas assistindo ao canal: ");
			int numeroPessoas = input.nextInt();
			
			switch (numeroCanal) {
			case 2:
				canal2 += numeroPessoas;
				break;
			case 4:
				canal4 += numeroPessoas;
				break;
			case 5:
				canal5 += numeroPessoas;
				break;
			case 7:
				canal7 += numeroPessoas;
				break;
			case 12:
				canal12 += numeroPessoas;
				break;
			default:
				System.out.println("Canal inválido. Informe um numero de canal valido.");
				break;
			}
			totalPessoas += numeroPessoas;
		}
		System.out.println("Percentual de Audiência por Canal:");
        System.out.println("Canal 2: " + ((double) canal2 / totalPessoas) * 100 + "%");
        System.out.println("Canal 4: " + ((double) canal4 / totalPessoas) * 100 + "%");
        System.out.println("Canal 5: " + ((double) canal5 / totalPessoas) * 100 + "%");
        System.out.println("Canal 7: " + ((double) canal7 / totalPessoas) * 100 + "%");
        System.out.println("Canal 12: " + ((double) canal12 / totalPessoas) * 100 + "%");
        
        input.close();
		
		
	
		
		

	}

}

