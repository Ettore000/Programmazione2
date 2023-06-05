/* Lezione 24
 * - Scope delle variabili
 * 
 * - cos'è
 * - scope locale
 * - scope globale
 */

package lezioneb24_Scope;

public class Main {

	public static void main(String[] args) {
		//lo scope di una variabile è quel raggio di azione in cui la variabile è disponibile nel codice
		
		Persona persona1=new Persona("Luca", "Rossi", 25, "blu");
		
		persona1.addizione(2, 5);
		
		persona1.dimmiUnNumero();
	}

}
