/* Lezione 26
 * - Metodo toString
 */

package lezioneb26_metodoToString;

public class Main {

	public static void main(String[] args) {
		Persona persona=new Persona("Luca", "Rossi", 25, "blu");
		
		System.out.println(persona); //ci aspetteremmo di vedere un riassunto di quella persona
		//in realtà ci mostrerà il codice di allocazione in memoria dell'oggetto
		//per questo incorriamo a scrivere l'override del metodo toString nella classe dell'oggetto
		//così possiamo specificare cosa dovrebbe stampare persona
	}

}
