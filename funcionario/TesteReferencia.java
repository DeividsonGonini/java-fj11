package exercicio.funcionario;

public class TesteReferencia {
public static void main(String [] args) {
	
	Funcionario f1 = new Funcionario();
	f1.setNome("Danilo");
	f1.setSalario(100);
	
	Funcionario f2 = new Funcionario();
	f2.setNome("Danilo");
	f2.setSalario(100);
	
	
	//teste 1:
	/*Construa dois funcionários com o new e compare-os com o ==. E se eles tiverem os mesmos atributos?
			Para isso você vai precisar criar outra referência:*/
	
	if(f1 == f2) {
		System.out.println("iguais");
	}else {
		System.out.println("diferentes");
	}
	
	//teste 2 :
	//Crie duas referências para o mesmo funcionário, compare-os com o ==. Tire suas conclusões. Para criar
	//duas referências pro mesmo funcionário:
	Funcionario f3 = new Funcionario();
	f3.setNome("Hugo");
	f3.setSalario(100);
	
	Funcionario f4 = f3;
	
	if(f3 == f4) {
		System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
	
	}
}
