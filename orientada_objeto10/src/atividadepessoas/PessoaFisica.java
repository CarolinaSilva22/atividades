package atividadepessoas;

/**
 * Classe PessoaFisica representa uma pessoa física com CPF.
 */
class PessoaFisica extends Pessoa {
    private String CPF;

    /**
     * Construtor para a classe PessoaFisica.
     * 
     * @param nome O nome da pessoa física.
     * @param CPF  O CPF da pessoa física.
     */
    public PessoaFisica(String nome, String CPF) {
        super(nome); // Chama o construtor da classe pai (Pessoa) para definir o nome.
        this.CPF = CPF;
    }

    /**
     * Obtém o CPF da pessoa física.
     * 
     * @return O CPF da pessoa física.
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Define o CPF da pessoa física.
     * 
     * @param CPF O novo CPF da pessoa física.
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
