package empresa;

public class Cadastro {
	  private Funcionario[] funcionarios;
	    private int contador;

	    public Cadastro(int tamanho) {
	        funcionarios = new Funcionario[tamanho];
	        contador = 0;
	    }

	    public void cadastrar(Funcionario funcionario) {
	        if (contador < funcionarios.length) {
	            funcionarios[contador] = funcionario;
	            contador++;
	            System.out.println("Funcionário cadastrado com sucesso!");
	        } else {
	            System.out.println("Não é possível cadastrar mais funcionários. Limite máximo atingido.");
	        }
	    }

	    public void imprimir() {
	        for (int i = 0; i < contador; i++) {
	            funcionarios[i].exibir();
	            System.out.println();
	        }
	    }
	}
