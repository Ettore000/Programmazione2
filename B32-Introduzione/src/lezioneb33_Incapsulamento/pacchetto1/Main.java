/* Lezione 33
 * - incapsulamento/encapsulation
 * 
 * - incapsulamento = processo in qui nascondiamo attributi di una classe all'esterno mettendoli private, diventano
 * 						accessibili solo tramite dei metodi (getters/setters)
 * - creiamo la classe Persona
 * - aggiungiamo attributi private
 * - definiamo getter e setter
 */

package lezioneb33_Incapsulamento.pacchetto1;

public class Main {

	public static void main(String[] args) {
		Persona persona=new Persona("Luca", "Rossi");
		System.out.println(persona.getNome());
		System.out.println(persona.getCognome()); //stampa
		
		persona.setCognome("Verdi"); //modifica
		System.out.println(persona.getCognome()); //stampa
		
		//il nascondere dentro le classi la loro stessa struttura è detto incapsulamento
	}

}
