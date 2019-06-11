package exercicio.funcionario;

public class Empresa {

//	private int arrayFuncionario;
	private String nome;
	private int cnpj;
	private String endereco;
	private String dono;
	Funcionario[] funcionario;

	
	
	// Metodo Construtor
	// Construtor sem argumento
	public Empresa(int arrayFuncionario) {
	this.funcionario = new Funcionario[arrayFuncionario];
	}

	// Construtor com argumento
	public Empresa(int arrayFuncionario, String nome) {
		this.funcionario = new Funcionario[arrayFuncionario];
		this.nome = nome;
	}

	// Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

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
				System.out.println("O empregado na posição " + i + " Se chama: " + funcionario[i].getNome()
						+ " e ganha " + funcionario[i].getSalario());
			}

		}
	}

}
