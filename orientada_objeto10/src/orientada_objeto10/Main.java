package orientada_objeto10;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Digite a capacidade máxima de cadastro de veiculos: ");
	int capacidade = input.nextInt();
	input.nextLine();
	
	Cadastro cadastro = new Cadastro(capacidade);
	
	while (true) {
		  System.out.println("Opções:");
          System.out.println("1. Cadastrar veículo");
          System.out.println("2. Imprimir cadastro");
          System.out.println("3. Sair");
          System.out.print("Escolha uma opção: ");
          int opcao = input.nextInt();
          input.nextLine();
          if (opcao == 1) {
        	  System.out.print("Marca do veículo: ");
              String marca = input.nextLine();

              System.out.print("Modelo do veículo: ");
              String modelo = input.nextLine();

              System.out.print("Número do chassi: ");
              String numeroChassi = input.nextLine();

              System.out.print("Placa do veículo: ");
              String placa = input.nextLine();

              System.out.print("Cor do veículo: ");
              String cor = input.nextLine(); 
              
              Veiculos veiculo = new Veiculos(marca, modelo , numeroChassi, placa, cor);
              cadastro.cadastrarVeiculo(veiculo);
              System.out.println("Veículo cadastrado com sucesso!");
          } else if (opcao == 2) {
        	  cadastro.imprimirCadastro();
          } else if (opcao == 3) {
        	  break;
          } else {
        	  System.out.println("Opcão inválida. Tente novamente!");
          }
	}
	
	input.close();

	}

}
