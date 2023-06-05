/* Lezione 28
 * - passare oggetti come parametri
 */

package lezioneb28_passareOggettiComeParametri;

public class Main {

	public static void main(String[] args) {
		Persona persona1=new Persona("Luca", "Rossi", 25, "blue");
		Persona persona2=new Persona("Marco", "Verdi", 25, "rosso");
		
		persona1.saluta(persona2);
		persona2.saluta(persona1);
	}

}
