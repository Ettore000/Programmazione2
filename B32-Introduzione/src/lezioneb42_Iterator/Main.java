/* Lezione 42
 * - Iterator
 * 
 * - un iteratore è un oggetto che cicla una collezione (ArrayList)
 * - loop di un ArrayList
 * - rimuovere un elemento
 */

package lezioneb42_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> persone=new ArrayList<String>();
		
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		persone.add("Paolo");
		
		Iterator<String> it=persone.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		//se ci sono ancora elementi, allora stampa
		while (it.hasNext()) {
			System.out.println(it.next());//in questo caso stampa solo Paolo
		}
		
		//come eliminare un elemento
		while (it.hasNext()) {
			String persona=it.next();
			if (persona == "Anna") {
				it.remove(); //in questo caso non cancella niente perché l'iteratore è già arrivato all'ultimo elemento
			}
		}
		System.out.println(persone);
	}

}
