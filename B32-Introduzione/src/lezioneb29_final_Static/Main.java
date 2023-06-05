/* Lezione 29
 * - final e static keyword
 */

package lezioneb29_final_Static;

public class Main {

	public static void main(String[] args) {
		final int prova=5; //valore finale della variabile, non può essere modificata
		
		Persona persona1=new Persona("Luca", "Rossi");
		Persona persona2=new Persona("Marco", "Verdi");
		
		System.out.println(persona1);
		
		System.out.println("Numero persone: "+Persona.numeroPersone);
		
		//richiamo statico
		Persona.mostraNumPersone();
	}

}
