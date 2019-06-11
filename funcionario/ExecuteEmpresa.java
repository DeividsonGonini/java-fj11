package exercicio.funcionario;

public class ExecuteEmpresa {
	public static void main(String[] args) {

	Empresa empresa = new Empresa(4);
	//Com o metodo construtor da empresa (linhas 1 e 2 a seguir) fica 
	//...desnecessaria (tem que tirar) a linha 3 nesta classe de execução!
	// 1 -	public Empresa(int arrayFuncionario) {
	// 2 - this.funcionario = new Funcionario[arrayFuncionario];
	// 3 - empresa.funcionario = new Funcionario[1];
	
	Funcionario f1 = new Funcionario();
	f1.setNome("João");
	f1.setSalario(200);
	empresa.setFuncionario(f1);
	
	Funcionario f2 = new Funcionario();
	f2.setNome("Amanda");
	f2.setSalario(500);
	empresa.setFuncionario(f2);
	
	Funcionario f3 = new Funcionario();
	f3.setNome("Jaspion");
	f3.setSalario(150);
	empresa.setFuncionario(f3);
	
		
	empresa.getFuncionario();
	
	
	}
}