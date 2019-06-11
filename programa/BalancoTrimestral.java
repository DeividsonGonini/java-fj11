package meu.programa;

public class BalancoTrimestral {
	public static void main(String [] arg){
	
	int gastosJaneiro = 15000;
	int gastosFevereiro = 23000;
	int gastosMarco = 17000;
	int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	
		System.out.println(gastosTrimestre);
	int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
		System.out.println("Valor da média mensal = "+ mediaMensal);
		
	/*	for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
			continue;
			}
			System.out.println(i);
			}
			*/
	
		
		int x = 5;
		double y = x++;
		double z = x/y;
		System.out.println(y);
		
	}
}