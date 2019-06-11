package exemplo.apostila.carro;

public class TestaCarro {
	public static void main(String [] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		Motor motor1 = new Motor();
		meuCarro.motor = motor1;
		
		
		meuCarro.motor.potencia = 2;
		meuCarro.motor.tipo = "GTI";
		
		//liga o carro
		meuCarro.liga();
		
		//acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.motor.potencia);
		System.out.println(meuCarro.motor.tipo);	
	}

}
