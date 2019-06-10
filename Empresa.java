package exercicio.funcionario;

public class Empresa {

	String nome;
	int cnpj;
	String endereco;
	String dono;
	Funcionario[] funcionario;

	public void setFuncionario(Funcionario f) {
		for (int i = 0; i < funcionario.length; i++) {
			if (funcionario[i] == null) {
				funcionario[i] = f;
				System.out.println("O empregado " + i + " foi adicionado!");
				i = i++;
				break;
			}
//			else {
//
//				System.out.println("Lista cheia");
//			}

		}
	}

	public void getFuncionario() {
		for (int i = 0; this.funcionario[i] != null; i++) {
			if (funcionario[i] != null) {
				System.out.println("O empregado na posição " + i + " Se chama: " + funcionario[i].nome + " e ganha "
						+ funcionario[i].salario);
			}

		}
	}

}
