package lezioneb23_Costruttore;

public class Persona {
	String nome, cognome, colorePreferito;
	int eta;
	
	//costruttore
	Persona(String nome, String cognome, int eta, String colorePreferito) {
		this.nome=nome; //alla variabile nome viene assegnato il valore di istanza che arriva dal Main
		this.cognome=cognome;
		this.eta=eta;
		this.colorePreferito=colorePreferito;
	}
}
