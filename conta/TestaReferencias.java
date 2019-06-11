package exemplos.apostila.conta;

public class TestaReferencias {

	public static void main(String args[]){
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1; // linha importante!!
		c2.deposita(200);
		
		System.out.println("Saldo c1 = " + c1.saldo);
		System.out.println("Saldo c2 = " + c2.saldo);
		
		

	}
}