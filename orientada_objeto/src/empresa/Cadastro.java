package empresa;

public class Cadastro {
	private Funcionario[] funcionarios;
	private int quantidade;
	
	public Cadastro() {
		funcionarios = new Funcionario[100];
		quantidade = 0;
		}

		public void cadastrar(Funcionario funcionario) {
		funcionarios[quantidade] = funcionario;
		quantidade++;
		}

		public void imprimir() {
		for (int i = 0; i < quantidade; i++) {
		funcionarios[i].exibir();
		System.out.println();
		}
}
}
