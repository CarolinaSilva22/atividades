package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Informe a quantidade de funcionários que deseja cadastrar: ");
        int tamanho = scanner.nextInt();
        
        Cadastro cadastro = new Cadastro(tamanho);
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Cargo: ");
            String cargo = scanner.next();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            System.out.print("Telefone: ");
            String telefone = scanner.next();

            System.out.print("Endereço: ");
            String endereco = scanner.next();

            Funcionario novoFuncionario = new Funcionario(nome, idade, cargo, salario, telefone, endereco);
            cadastro.cadastrar(novoFuncionario);

            System.out.println();
        }

        cadastro.imprimirCadastro();
       
    }
}
