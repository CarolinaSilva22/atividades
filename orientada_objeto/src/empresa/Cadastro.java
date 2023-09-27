package empresa;

class Cadastro {
    private Funcionario[] funcionarios;
    private int tamanho;
  
    public Cadastro(int tamanho) {
        funcionarios = new Funcionario[tamanho];
        tamanho = 0;
    }

    public void cadastrar(Funcionario funcionario) {
        if (tamanho < funcionarios.length) {
            funcionarios[tamanho] = funcionario;
            tamanho++;
            System.out.println("Funcionário cadastrado!!");
         } else {
            System.out.println("Não foi possivel adicionar mais funcionarios!!");
        }
    }

    public void imprimirCadastro() {
        System.out.println("Lista de Funcionários cadastrados:");
        for (int i = 0; i < tamanho; i++) {
            funcionarios[i].exibe();
            System.out.println();
        }
    }
}
  

  

