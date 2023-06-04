/* Lezione 17
 * - metodi stringhe
 * 
 * - equals, equalsIgnoreCase, length, charAt
 * - indexOf, isEmpty, toUpperCase, toLowerCase
 * - trim, replace
 */

package lezioneb17_metodiStringhe;

public class Main {

	public static void main(String[] args) {
		String nome="Leonardo";
		
		boolean risultato=nome.equals("Leonardo"); //case sensitive
		boolean risultato1=nome.equalsIgnoreCase("lEoNardO"); //non case sensitive
		int risultato2=nome.length(); //lunghezza del nome
		char risultato3=nome.charAt(7); //che carattere c'è alla posizione 7, le posizioni partono da 0
		int risultato4=nome.indexOf("a"); //in che posizione si trova la lettera a
		boolean risultato5=nome.isEmpty(); //se nome è una variabile con stringa vuota
		String risultato6=nome.toUpperCase(); //tutto in lettere maiuscole
		String risultato7=nome.toLowerCase(); //tutto in lettere minuscole
		String risultato8=nome.trim(); //elimina tutti gli spazi
		String risultato9=nome.replace('o', 'w'); //sostituisce tutte le occorrenze di un carattere con un altro carattere
		
		System.out.println(risultato);
		System.out.println(risultato1);
		System.out.println(risultato2);
		System.out.println(risultato3);
		System.out.println(risultato4);
		System.out.println(risultato5);
		System.out.println(risultato6);
		System.out.println(risultato7);
		System.out.println(risultato8);
		System.out.println(risultato9);
	}

}
