package exemplos.apostila.conta;

public class TestaReferencia2 {

	public static void main(String [] args) {
		Conta c1 = new Conta();
		c1.dono = "Duke";
		c1.saldo = 227;
		
		Conta c2 = new Conta();
		c2.dono = "Duke";
		c2.saldo = 227;
		
		if  (c1 == c2) {
			System.out.println("Contas iguais");
					}
		//o else eu que coloquei para mostrar que sao diferentes, pois c1 é uma referencia e c2 é outra referencia
		else {
			System.out.println("Contas Diferentes");
			
		}
	}
}
