package exercicio.funcionario;

public class Execute {
	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Forest");
		f1.setSalario(5000);
		f1.setDepartamento("Programador");
		Data data1 = new Data();
		f1.setDataAdmissao(data1);
		f1.setRg("99.573.149-7");
		f1.recebeAumento(1500);
		data1.dia = 01;
		data1.mes = 07;
		data1.ano = 2019;
		f1.setDataAdmissao(data1);

		// System.out.println("Salario Atual: " + f1.salario);

		f1.calculaGanhoAnual();
		// System.out.println("Ganho Anual: " + valorAnual);

		f1.demite(1);

		Funcionario f2 = new Funcionario("Pereira");
//	f2.setNome("Gilmar");
		f2.setSalario(3200);
		f2.setDepartamento("Segurança");
		Data data2 = new Data();
		f2.setDataAdmissao(data1);
		f2.setRg("77.597.315-12");
		f2.recebeAumento(0);
		data2.dia = 01;
		data2.mes = 01;
		data2.ano = 2010;
		f2.setDataAdmissao(data2);

		// System.out.println("Salario Atual: " + f1.salario);

		f1.calculaGanhoAnual();
		// System.out.println("Ganho Anual: " + valorAnual);

		f1.demite(0);

		f1.mostra();
		f2.mostra();

	}

}
