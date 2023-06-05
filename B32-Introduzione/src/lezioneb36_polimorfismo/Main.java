/* Lezione 36
 * - polimorfismo/polymorphism
 */

package lezioneb36_polimorfismo;

public class Main {

	public static void main(String[] args) {
		//capacità di un oggetto di identificarsi con più tipi di dato
		//un oggetto è in grado di assumere più forme
		
		Studente studente1=new Studente("Luca", "Rossi");
		Insegnante insegnante1=new Insegnante("Marco", "Verdi");
		
		Persona[] classe = {studente1, insegnante1}; //polimorfismo di Persona
	}

}
