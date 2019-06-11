package forma.arrays;

public class ArraysBasico {

	public static void main (String[] args) {
	//gravação da lista
	int n[] = {8,9,6,0,7,4,3,1,2};
	System.out.println("Tamanho de N:" + n.length);	
	
	//for tradicional = percorre a lista
	for(int i = 0; i<=n.length-1 ;i ++) {
	System.out.println("Na posição: " + i + " " + "Temos: " + n[i]);
	}
	//for para vetores
	for(int i: n) {
	System.out.println(i);	
	}
	}
}
