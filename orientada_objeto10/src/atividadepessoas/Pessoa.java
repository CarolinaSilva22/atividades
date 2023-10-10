package atividadepessoas;
import java.util.Scanner;
/**
 * Classe Pessoa representa uma pessoa com nome.
 */
class Pessoa {
	private String nome;
	
	/**
	 * Construtor para a classe Pessoa.
	 * 
	 * @param nome O nome da pessoa.
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtém o nome da pessoa.
	 * 
	 * @return O nome da pessoa.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Define o nome da pessoa.
	 * 
	 * @param nome O novo nome da pessoa.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}

