package exercicio.funcionario;

public class Data {
	int dia;
	int mes;
	int ano;


	String dataFormatada(){
		String formata = this.dia  + "/" + this.mes + "/" + this.ano;
			System.out.println(formata);
	return formata;		
	}
}
