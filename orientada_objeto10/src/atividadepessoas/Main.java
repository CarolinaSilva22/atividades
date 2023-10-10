package atividadepessoas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade máxima de cadastro de pessoas: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Cadastro cadastro = new Cadastro(capacidade);

        while (true) {
            System.out.println("Opções:");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Imprimir cadastro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Nome da pessoa: ");
                String nome = scanner.nextLine();

                System.out.println("Escolha o tipo de pessoa:");
                System.out.println("1. Pessoa Física");
                System.out.println("2. Pessoa Jurídica");
                int tipo = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (tipo == 1) {
                    System.out.print("CPF da pessoa física: ");
                    String CPF = scanner.nextLine();
                    PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
                    cadastro.cadastrarPessoa(pessoaFisica);
                } else if (tipo == 2) {
                    System.out.print("CNPJ da pessoa jurídica: ");
                    String CNPJ = scanner.nextLine();
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
                    cadastro.cadastrarPessoa(pessoaJuridica);
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } else if (opcao == 2) {
                cadastro.imprimirCadastro();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
