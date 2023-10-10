package atividadepessoas;

/**
 * Classe Cadastro permite cadastrar pessoas, pessoas físicas e pessoas jurídicas em um vetor e imprimir o vetor de cadastro.
 */
class Cadastro {
    private Pessoa[] pessoas;
    private int tamanho;
    private int capacidade;

    /**
     * Construtor para a classe Cadastro.
     * 
     * @param capacidade A capsacidade inicial do vetor de cadastro.
     */
    public Cadastro(int capacidade) {
        this.capacidade = capacidade;
        this.pessoas = new Pessoa[capacidade];
        this.tamanho = 0;
    }

    /**
     * Adiciona uma pessoa ao vetor de cadastro.
     * 
     * @param pessoa A pessoa a ser adicionada.
     */
    public void cadastrarPessoa(Pessoa pessoa) {
        if (tamanho < capacidade) {
            pessoas[tamanho] = pessoa;
            tamanho++;
        } else {
            System.out.println("Cadastro de pessoas está cheio.");
        }
    }

    /**
     * Imprime o vetor de cadastro de pessoas.
     */
    public void imprimirCadastro() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Pessoa #" + (i + 1) + ": " + pessoas[i].getNome());
            if (pessoas[i] instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) pessoas[i];
                System.out.println("   CPF: " + pf.getCPF());
            } else if (pessoas[i] instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) pessoas[i];
                System.out.println("   CNPJ: " + pj.getCNPJ());
            }
        }
    }
}
