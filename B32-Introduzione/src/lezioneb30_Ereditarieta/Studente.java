package lezioneb30_Ereditarieta;

public class Studente extends Persona{
	String materiaPreferita;
	String classe="2D";
	int[] votiStoria= {9,9,9};

	public Studente(String nome, String cognome, String materiaPreferita) {
		super(nome, cognome);
		this.materiaPreferita=materiaPreferita;
	}
	
	void studia() {
		System.out.println("Sto studiando...");
	}
	
	@Override //serve a segnalare l'override
	void saluta() {
		System.out.println("Buongiorno Prof.");
	}

}
