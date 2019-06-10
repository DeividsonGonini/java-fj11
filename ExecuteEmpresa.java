package exercicio.funcionario;

public class ExecuteEmpresa {
	public static void main(String[] args) {

	Empresa empresa = new Empresa();
	empresa.funcionario = new Funcionario[5];
	
	Funcionario f1 = new Funcionario();
	f1.nome = "João";
	f1.salario = 200;
	empresa.setFuncionario(f1);
	
	Funcionario f2 = new Funcionario();
	f2.nome = "Amanda";
	f2.salario = 500;
	empresa.setFuncionario(f2);
	
	Funcionario f3 = new Funcionario();
	f3.nome = "Jaspion";
	f3.salario = 150;
	empresa.setFuncionario(f3);
	
		
	empresa.getFuncionario();
	
	}
}