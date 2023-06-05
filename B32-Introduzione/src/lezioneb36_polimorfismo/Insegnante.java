package lezioneb36_polimorfismo;

public class Insegnante extends Persona{
	public Insegnante(String nome, String cognome) {
		super(nome, cognome);
	}
	
	void insegna() {
		System.out.println("Sto insegnando...");
	}

}
