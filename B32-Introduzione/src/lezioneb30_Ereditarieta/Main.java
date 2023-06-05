/* Lezione 30
 * - Ereditarietà/Inheritance
 * 
 * - cos'è l'ereditarietà
 * - creiamo classi figlie studente e insegnante
 * - metodi e attributi aggiuntivi
 * - overriding dei metodi (@Override)
 * - costruttore classi figlie e super keyword
 */

package lezioneb30_Ereditarieta;

public class Main {

	public static void main(String[] args) {
		/*l'ereditarietà è quel meccanismo che permette ad una classe di derivare da un'altra classe ed
		ereditarne metodi e attributi*/
		
		Persona persona1=new Persona("Luca", "Rossi");
		persona1.saluta();
		
		Studente studente1=new Studente("Luca", "Rossi", "Storia");
		System.out.println(studente1.nome);
		studente1.saluta();
		studente1.studia();
		
		Insegnante insegnante1=new Insegnante("Marco", "Verdi", "Matematica");
		System.out.println(insegnante1.nome);
		insegnante1.insegna();
		insegnante1.saluta();
	}

}
