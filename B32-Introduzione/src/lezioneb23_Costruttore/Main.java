/* Lezione 23
 * - Costruttore
 * 
 * - cos'è un costruttore
 * - creazione
 * - parola chiave this
 */

package lezioneb23_Costruttore;

public class Main {

	public static void main(String[] args) {
		Persona persona1=new Persona("Luca", "Rossi", 25, "blu"); //istanza 1
		Persona persona2=new Persona("Marco", "Verdi", 35, "rosso"); //istanza 2
		
		//stampa
		System.out.println(persona1.cognome);
		System.out.println(persona2.cognome);
	}

}
