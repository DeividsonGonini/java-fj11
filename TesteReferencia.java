package exercicio.funcionario;

public class TesteReferencia {
public static void main(String [] args) {
	
	Funcionario f1 = new Funcionario();
	f1.nome = "Danilo";
	f1.salario = 100;
	Funcionario f2 = new Funcionario();
	f2.nome = "Danilo";
	f2.salario = 100;
	
	
	//teste 1:
	/*Construa dois funcion�rios com o new e compare-os com o ==. E se eles tiverem os mesmos atributos?
			Para isso voc� vai precisar criar outra refer�ncia:*/
	
	if(f1 == f2) {
		System.out.println("iguais");
	}else {
		System.out.println("diferentes");
	}
	
	//teste 2 :
	//Crie duas refer�ncias para o mesmo funcion�rio, compare-os com o ==. Tire suas conclus�es. Para criar
	//duas refer�ncias pro mesmo funcion�rio:
	Funcionario f3 = new Funcionario();
	f3.nome = "Hugo";
	f3.salario = 100;
	
	Funcionario f4 = f3;
	
	if(f3 == f4) {
		System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
	
	}
}
