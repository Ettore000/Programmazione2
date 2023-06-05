package lezioneb36_polimorfismo;

public class Studente extends Persona{
	public Studente(String nome, String cognome) {
		super(nome, cognome);
	}
	
	void studia() {
		System.out.println("Sto studiando...");
	}
	
	@Override //serve a segnalare l'override
	void saluta() {
		System.out.println("Buongiorno Prof.");
	}

}
