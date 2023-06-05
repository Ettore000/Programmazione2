package lezioneb27_arrayDiOggetti;

public class Persona {
	String nome, cognome, colorePreferito;
	int eta;
	
	Persona(String nome, String cognome, int eta, String colorePreferito) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
		this.colorePreferito=colorePreferito;
	}
	
	public String toString() {
		String stringa=this.nome+"\n"+this.cognome+"\n"+this.eta+"\n"+this.colorePreferito;
		
		return stringa;
	}
}
