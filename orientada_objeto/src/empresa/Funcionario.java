package empresa;

class Funcionario {
    private String nome, cargo, telefone, endereco;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void exibe() {
        System.out.println("*Nome: " + nome);
        System.out.println("*Idade: " + idade);
        System.out.println("*Cargo: " + cargo);
        System.out.println("*Salário: " + salario);
        System.out.println("*Telefone: " + telefone);
        System.out.println("*Endereço: " + endereco);
    }
}
