package meu.primeiro.projeto;

public class multiploTresDeUmACem {
	public static void main(String [] args) {
		
		int a1 = 0;
		int a2;	
	
		while(a1 < 101) {
			a2 = a1 % 3;
			if (a2 == 0){
				System.out.println(a1);
				a1 = ++a1;
			}
			else {
				a1 = ++a1;
						}
		}
	}	
		/*int a3 = 9 % 3;
		if (a3 == 0) {
		System.out.println("Divisivel por 3 pois o resto é "+ a3);
		}
		else {
				System.out.println("Não divisivel por 3 pois o resto é "+ a3);
		}*/
	}
