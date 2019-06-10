package exercicio.funcionario;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataAdmissao;
	String rg;

	void recebeAumento(double quantidade) {
		salario += quantidade;
	System.out.println("O funcionario ira receber agora:" + salario);
	}
	
	void calculaGanhoAnual() {
		double anual = salario * 12;
		System.out.println("O Ganho anual do funcionario é de: " + anual);
	}
	
	boolean demite(int ativo){
		int estaNaEmpresa = 1;
		if(estaNaEmpresa == ativo){
			System.out.println("o funcionario esta Ativo");
			return true;
			
			}
		else {
			System.out.println("o funcionario esta Inativo");
			return false;
		}
	}
	
		void mostra() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Departamento: " + this.departamento);
			System.out.println("Salario: " + this.salario);
			System.out.println("data de Adimissao: " + this.dataAdmissao.dia + "/" + this.dataAdmissao.mes + 
					"/" + this.dataAdmissao.ano);
			System.out.println("RG: " + this.rg);
			this.calculaGanhoAnual();
		}
		
	}
