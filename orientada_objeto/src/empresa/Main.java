package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite quantos funcionários quer cadastrar: ");
        int tamanho = scanner.nextInt();
        
        Cadastro cadastro = new Cadastro(tamanho);
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Formulário - funcionário " + (i + 1) + ":");

            System.out.print("Insira o nome: ");
            String nome = scanner.next();

            System.out.print("Insira a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Insira o cargo: ");
            String cargo = scanner.next();

            System.out.print("Insira o salário: ");
            double salario = scanner.nextDouble();

            System.out.print("Insira o telefone: ");
            String telefone = scanner.next();

            System.out.print("Insira o endereço: ");
            String endereco = scanner.next();

            Funcionario novoFuncionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
            cadastro.cadastrar(novoFuncionario);

            System.out.println();
        }

        cadastro.imprimirCadastro();
       
    }
}
