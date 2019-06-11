package exemplo.apostila.carro;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	
	//liga o carro
	void liga() {
		System.out.println("O Carro está ligado");
			}
	//Acelera uma certa quantidade (x km/h)
	void acelera(double quantidade) {
		velocidadeAtual += quantidade;
		System.out.println("O Carro agora esta em " + velocidadeAtual + " km/h");
	}

	//Devolve a marcha do carro

	int pegaMarcha(){
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}

