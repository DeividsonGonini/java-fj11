package meu.programa;

public class Fibonacci {

	public static void main(String [] arg) {
		int n2 = 1;
		
		for(int n1 = 0; n1 == 100; n1++) {
			int resultado = n1 + n2;
			n2 = resultado;
			System.out.println(n1  + n2 +  resultado);
		}
	
	
	}

}