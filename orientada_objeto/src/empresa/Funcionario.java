package empresa;

public class Funcionario {
		private String nome, cargo, telefone,endereco;
		private float salario;
		private int idade;

		
		public Funcionario() {
			/**Atributos*/
			this.nome = nome;
			this.idade = idade;
			this.cargo = cargo;
			this.telefone = telefone;
			this.endereco = endereco;
			this.salario = salario;
		}
		/**Metodos*/
		public String exibir() {
			String info = "/nNome: "+nome+"/nIdade: "+idade+"/nCargo: "+cargo+"/nTelefone: "+telefone+"/nEndereço: "+endereco+"/nSalário: "+salario;
			return (info);
		}

}
