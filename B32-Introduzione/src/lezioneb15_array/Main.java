/* Lezione 15
 * - Array
 * 
 * - cosa sono gli array
 * - creare un array vuoto
 * - associare elementi
 * - Array.toString
 * - lunghezza array
 * - modificare elementi
 * - mostrare elementi
 * - ciclare array con for e foreach
 */

package lezioneb15_array;

public class Main {

	public static void main(String[] args) {
		//gli array in Java hanno una dimensione fissa
		//dichiarazione
		int[] numeri=new int[3]; //crea un nuovo array di interi con lunghezza 3
		
		//assegnazione
		numeri[0]=10;
		numeri[1]=20;
		numeri[2]=30;
		
		//stampa
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		
		//modifica
		numeri[0]=100;
		numeri[1]=200;
		numeri[2]=300;
		
		//stampa
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		
		//dichiarazione
		int[] altriNumeri={10, 20, 30};
		
		System.out.println(altriNumeri[1]);
		System.out.println(altriNumeri.length);
		//c'è una differenza tra length e posizione
		//le posizioni partono da 0, mentre la length parte da 1
		
		System.out.println(altriNumeri[altriNumeri.length-1]); //accede all'elemento in ultima posizione
		
		//ciclare gli elementi di un array con un for
		for (int i = 0; i < altriNumeri.length; i++) { //si usa il for perché sappiamo la dimensione
			System.out.println(altriNumeri[i]);
		}
		
		//ciclare array con foreach
		for (int numero : altriNumeri) {
			System.out.println(numero);
		}
	}

}
