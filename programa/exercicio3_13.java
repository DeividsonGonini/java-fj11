package meu.programa;

public class exercicio3_13 {
	public static void main(String [] args) {
	
		// P.39
		//ex a
		for (int i = 150; i < 301; i = ++i){
			System.out.println("Numero " + i);
		
		}
		
		//Ex b somando 
		int x = 0;
		int y = 0;
		int z;
		for (y = x; y <= 1000; y = x++) {
			System.out.println(y + "+" + x + "=" + (z = x + y));
		}
		
	}

}
