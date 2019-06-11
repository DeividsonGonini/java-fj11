package forma.arrays;

import java.util.ArrayList;

public class ExecutePessoas {
	public static void main(String[] args) {

		Pessoas p1 = new Pessoas();
		Pessoas p2 = new Pessoas();
		Pessoas p3 = new Pessoas();
		Pessoas p4 = new Pessoas();

		p1.setNome("Joaozinho");
		p1.setIdade(10);

		p2.setNome("Pedro");
		p2.setIdade(50);

		p3.setNome("Amanda");
		p3.setIdade(27);

		p4.setNome("Ana");
		p4.setIdade(3);

		ArrayList<Pessoas> pessoa = new ArrayList<Pessoas>();

		pessoa.add(p1);
		pessoa.add(p2);
		pessoa.add(p3);
		pessoa.add(p4);

		for (int i = 0; i < pessoa.size(); i++) {
			if (pessoa.get(i).getIdade() > 20) {
				System.out.println("Nome: " + pessoa.get(i).getNome() + " - Idade: " + pessoa.get(i).getIdade());
			}
		}
	}
}
