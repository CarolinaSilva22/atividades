package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		  System.out.print("Informe a quantidade de funcionários que deseja cadastrar: ");
	        int tamanho = input.nextInt();
	        
	        Cadastro cadastro = new Cadastro(tamanho);
	        
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println("Funcionário " + (i + 1) + ":");
	            
	            System.out.print("Nome: ");
	            String nome = input.next();
	            
	            System.out.print("Idade: ");
	            int idade = input.nextInt();
	            
	            System.out.print("Cargo: ");
	            String cargo = input.next();
	            
	            System.out.print("Salário: ");
	            double salario = input.nextDouble();
	            
	            System.out.print("Telefone: ");
	            String telefone = input.next();
	            
	            System.out.print("Endereço: ");
	            String endereco = input.next();
	            
	            Funcionario funcionario = new Funcionario();
	            cadastro.cadastrar(funcionario);
	            
	            System.out.println();
	        }
	        
	        cadastro.imprimir();
	        
	        input.close();
	    }
	}

