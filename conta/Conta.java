package exemplos.apostila.conta;

public class Conta {

	int numero;
	String dono;
	double saldo;
	double limite;
	Cliente titular = new Cliente();
	
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	//parte simples
	void transfere(Conta destino ,double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
		}

		/*boolean transfere(Conta destino, double valor) {
			boolean retirou = this.saca(valor);
			if (retirou == false) {
				//nao deu para sacar!
				return false;
			}
			else {
				destino.deposita(valor);
				return true;
			}*/
			}
		

