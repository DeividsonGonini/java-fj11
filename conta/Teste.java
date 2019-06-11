package exemplos.apostila.conta;

public class Teste {

	public static void main(String [] args) {
		Conta minhaConta = new Conta();
		//Cliente c = new Cliente();
		//minhaConta.titular = c;
		
	//modelo 1
		/*Cliente clienteDaMinhaConta = minhaConta.titular;
		clienteDaMinhaConta.nome = "Duke";*/
		
		//modelo 2 
		minhaConta.titular.nome = "Duke ";
		minhaConta.titular.sobrenome = "Da Silva";
		System.out.println("Nome do Cliente: " + minhaConta.titular.nome + minhaConta.titular.sobrenome);
	
		
	}
}	
