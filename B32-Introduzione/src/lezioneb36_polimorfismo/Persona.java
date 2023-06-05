package lezioneb36_polimorfismo;

public class Persona {
	String nome, cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	void saluta() {
		System.out.println("Ciao");
	}
}
