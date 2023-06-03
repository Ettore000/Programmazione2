/* Lezione 13
 * - ciclo while
 * 
 * - cos'è un ciclo
 * - a cosa serve un ciclo
 * - ciclo while
 * - ciclo do while
 */

package lezioneb13_while_doWhile;

public class Main {

	public static void main(String[] args) {
		//iteratore
		int i=0;
		
		//while
		while(i<5) {
			System.out.println("while: "+i);
			i++;
		}
		
		//do while
		do {
			System.out.println("do while: "+i);
			i++;
		} while (i<5);
	}

}
