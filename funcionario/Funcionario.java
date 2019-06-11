package exercicio.funcionario;

public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	private Data dataAdmissao;
	private String rg;
	private static int identificador;

	// Metodo Construtor

//	//Construtor sem argumento
	public Funcionario() {
		identificador = identificador + 1;
	}

	// Construtor com argumento
	public Funcionario(String nome) {
		this.nome = nome;
		identificador = identificador + 1;
	}

	// Getters e Setters

	public static int getIdentificador() {
		return identificador;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Data getDataAdmissao() {
		return dataAdmissao;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	// Metodos
	void recebeAumento(double quantidade) {
		salario += quantidade;
		System.out.println("O funcionario ira receber agora:" + salario);
	}

	void calculaGanhoAnual() {
		double anual = salario * 12;
		System.out.println("O Ganho anual do funcionario é de: " + anual);
	}

	boolean demite(int ativo) {
		int estaNaEmpresa = 1;
		if (estaNaEmpresa == ativo) {
			System.out.println("o funcionario esta Ativo");
			return true;

		} else {
			System.out.println("o funcionario esta Inativo");
			return false;
		}
	}

	void mostra() {
		System.out.println("Nome: " + getNome() + " Identificador " + getIdentificador());
		System.out.println("Departamento: " + getDepartamento());
		System.out.println("Salario: " + getSalario());
		System.out.println("data de Adimissao: " + getDataAdmissao().dia + "/" + getDataAdmissao().mes + "/"
				+ getDataAdmissao().ano);
		System.out.println("RG: " + getRg());
		this.calculaGanhoAnual();
	}

}
