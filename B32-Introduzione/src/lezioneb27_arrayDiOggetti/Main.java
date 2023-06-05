/* Lezione 27
 * - array di oggetti
 * 
 * - creare array di tipo oggetto vuoto
 * - creare oggetti
 * - assegnare oggetti come elementi array
 * - accedere agli elementi
 * - creare array con elementi già presenti
 */

package lezioneb27_arrayDiOggetti;

public class Main {

	public static void main(String[] args) {
		Persona[] persone=new Persona[3]; //crea un array di tipo oggetto vuoto
		
		//creazione istanze oggetti
		Persona persona1=new Persona("Luca", "Rossi", 25, "blue");
		Persona persona2=new Persona("Marco", "Verdi", 25, "rosso");
		Persona persona3=new Persona("Anna", "Neri", 23, "giallo");
		
		//aggiunta elementi
		persone[0]=persona1;
		persone[1]=persona2;
		persone[2]=persona3;
		
		//stampa
		System.out.println(persone[0].nome);
		System.out.println(persone[2]);
		
		//se gli elementi sono già presenti si elimina la dichiarazione e l'assegnazione dell'array
		//e direttamente si scrive dopo gli oggetti l'inizializzazione dell'array
		//ovvero: Persona[] persone={persona1, persona2, persona3};
	}

}
