package exercicio.funcionario;

public class Execute {
	public static void main(String [] args) {
	Funcionario	funcionario = new Funcionario();
	funcionario.nome = "Forest";
	funcionario.salario = 5000;
	funcionario.departamento = "Garoto de Programa";
	Data data1 = new Data();
	funcionario.dataAdmissao = data1;
	funcionario.rg = "99.573.149-7";
	funcionario.recebeAumento(1000);
	funcionario.dataAdmissao.dia = 02;
	funcionario.dataAdmissao.mes = 10;
	funcionario.dataAdmissao.ano = 2017;

	
	//System.out.println("Salario Atual: " + funcionario.salario);
	
	funcionario.calculaGanhoAnual();
	//System.out.println("Ganho Anual: " + valorAnual);
	
	
	
	funcionario.demite(1);
	
	funcionario.mostra();
	
	System.out.println("Data de entrada: " + funcionario.dataAdmissao.dataFormatada());

	}

}
