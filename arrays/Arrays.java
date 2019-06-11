package forma.arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Carlos");

		nomes.add("João");

		nomes.add("Pedro");

//Printa a posição do nome procurado
		// System.out.println(nomes.indexOf("Pedro"));

		for (String nome : nomes) {
			System.out.println(nome);
		}

	}
}