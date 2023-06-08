/*
 * Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome,
 * cognome, codice ed età, e che contenga il costruttore parametrizzato ed i metodi getCodice, getCognome e
 * getEta che restituiscono rispettivamente il codice, il cognome e l’età del docente.
 * Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari tramite un array di tipo
 * Docente, e che contenga il costruttore parametrizzato ed un metodo etaMinima che restituisce la minima
 * età tra i docenti universitari.
 * Tempo: 20 minuti
 */

package esercizio2;

public class Docente {
	public Docente(String nome, String cognome, int codice, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.eta = eta;
	}
	
	public Docente(Docente docenti) {
		this.nome = docenti.getNome();
		this.cognome = docenti.getCognome();
		this.codice = docenti.getCodice();
		this.eta = docenti.getEta();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getCodice() {
		return codice;
	}
	public int getEta() {
		return eta;
	}

	private String nome, cognome;
	private int codice, eta;
}
