package lezioneb24_Scope;

public class Persona {
	//Scope globale, variabili che vengono definite fuori dai metodi, le variabili esistono dentro la classe
	String nome, cognome, colorePreferito;
	int eta;
	
	public Persona(String nome, String cognome, int eta, String colorePreferito) {
		this.nome = nome;
		this.cognome = cognome;
		this.colorePreferito = colorePreferito;
		this.eta = eta;
	}
	
	void dimmiUnNumero() {
		//Scope locale, variabili che vengono definite dentro i metodi, le variabili esistono dentro il metodo
		int numero=5;
		System.out.println(numero);
	}
	
	void addizione(int a, int b) {
		int risultato=a+b; //variabile locale
		this.qwerty(risultato); /*possiamo passare il valore di una variabile locale a un metodo
								che non ha questa variabile, attraverso il parametro*/
		//i parametri hanno scope globale
		
		System.out.println("da addizione "+this.nome);
	}
	
	void qwerty(int prova) {
		System.out.println("il risultato è "+prova);
		
		System.out.println("da qwerty "+this.nome);
	}
}
