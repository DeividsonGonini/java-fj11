package meu.programa;

public class fatorial {

	public static void main(String [] arg) {
		//caso precise fazer com um numero maior, tera que trocar de "int" para "long" ou para "double"
		//se nao ele estoura o limite
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial = fatorial * n;
			
			System.out.println("O fatorial de " + n + " é: " + fatorial);
			
		}
	}
	
}
