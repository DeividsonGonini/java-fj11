package execericio.teste;

public class Casa {

	String cor;
	int totalPortas;
	int abertas = 0;
	Porta[] porta;

	public void setPorta(Porta p) {
		for (int i = 0; i < porta.length; i++) {
			if (porta[i] == null) {
				porta[i] = p;
				break;
			}

		}
	}

	public void getPorta() {
		for (int i = 0; i < this.porta.length; i++) {
			System.out.println("Porta adicionada " + porta[i].nome);
			System.out.println("A porta esta " + porta[i].aberta);
		}
	}

	public int portasAbertas() {
		for (int i = 0; i < this.porta.length; i++) {
			if (this.porta[i].aberta == true) {
				abertas = + 1;
				System.out.println("Temos " + abertas + " porta aberta na casa");
//				return abertas;

			}
		}
		return abertas;

	}
	}