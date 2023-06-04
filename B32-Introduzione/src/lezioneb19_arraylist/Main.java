/* Lezione 19
 * - Arraylist
 * 
 * - le Arraylist sono array ridimensionabili
 * - accettano solo reference
 * 
 * - creare un Arraylist
 * - aggiungere elementi add()
 * - mandare a schermo elementi get()
 * - modificare elementi set()
 * - rimuovere elementi remove(), clear()
 * 
 * - Arraylist 2D
 */

package lezioneb19_arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//dichiarazione
		ArrayList<String> persone=new ArrayList<String>();
		
		//aggiunta elementi
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		
		persone.set(2, "Paola"); //modifica Anna con Paola
		persone.remove(0); //rimuove Luca
		//persone.clear(); //rimuove tutto
		
		//come ciclare
		for (int i=0; i<persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		//Arraylist 2D
		ArrayList<ArrayList<String>> classi=new ArrayList<>();
		
		ArrayList<String> classe1=new ArrayList<String>();
		classe1.add("Luca");
		classe1.add("Marco");
		
		ArrayList<String> classe2=new ArrayList<String>();
		classe2.add("Anna");
		classe2.add("Orazio");
		
		//aggiunta in principale
		classi.add(classe1);
		classi.add(classe2);
		
		//stampa
		for (int i = 0; i < classi.size(); i++) {
			System.out.println();
			for (int j = 0; j < classi.get(i).size(); j++) {
				System.out.print(classi.get(i).get(j)+" ");
			}
		}
	}

}
