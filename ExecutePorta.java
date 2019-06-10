package execericio.teste;

public class ExecutePorta {

	public static void main (String[] args) {
	
	Casa casa = new Casa();
	casa.porta = new Porta[5];
	
	
	Porta p1 = new Porta();
	p1.nome = "quarto";
	p1.aberta = true;
	casa.setPorta(p1);
	
	Porta p2 = new Porta();
	p2.nome = "Sala";
	p2.aberta = false;
	casa.setPorta(p2);
	
	Porta p3 = new Porta();
	p3.nome = "cozinha";
	p3.aberta = true;
	casa.setPorta(p3);
	
	casa.getPorta();
	
	casa.portasAbertas();


	}
}
