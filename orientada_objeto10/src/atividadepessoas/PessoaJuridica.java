package atividadepessoas;

class PessoaJuridica extends Pessoa {
	private String CNPJ;
	
	/**
	 * Construtor para a classe PessoaJuridica.
	 * 
	 * @param nome O nome da pessoa juridica.
	 * @param CNPJ da pessoa juridica.
	 */
	public PessoaJuridica(String nome, String CNPJ) {
		super(nome);
		this.CNPJ =CNPJ;
	}
	
	/**
	 * Obtém o CNPJ da pessoa juridica.
	 * 
	 * @return O CNPJ da pessoa juridica.
	 */
	public String getCNPJ() {
		return CNPJ;
	}
	
	/**
	 * Define o CNPJ da pessoa juridica.
	 * 
	 * @param CNPJ O novo CNPJ da pessoa juridica.
	 */
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
}
