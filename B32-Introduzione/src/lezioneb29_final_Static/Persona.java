package lezioneb29_final_Static;

public class Persona {
	String nome, cognome;
	static int numeroPersone; //vogliamo sapere quante persone abbiamo generato
	//abbiamo bisogno che numeroPersone sia una variabile statica
	//ovvero, che sia condivisa con tutti
	//static -> "questo è uguale per tutti"
	
	Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		numeroPersone++; //in questo modo sappiamo quante volte nell'esecuzione del codice è stata generata una persona
		System.out.println(numeroPersone);
	}
	
	public String toString() {
		String stringa=this.nome+"\n"+this.cognome;
		
		return stringa;
	}
	
	//così può essere richiamato dal Main
	static void mostraNumPersone() {
		System.out.println("Il numero di persone create è: "+numeroPersone);
	}
}
