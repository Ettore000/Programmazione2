/* Lezione 7
 * - operazioni aritmetiche
 * 
 * - operatori aritmetici: + - / * %
 * - shorthand
 * - incremento e decremento
 * - esempi di espressioni
 * 
 */

package lezione7;

public class Main {

	public static void main(String[] args) {
		int x=11;
		x=x+3;
		x+=3; //shorthand
		x++; //incremento
		
		int y=3;
		y=x%y; //resto
		
		int risultato=2+(98*(3-8)/2)*y-4+(44*(x)-43)/2;
		
		System.out.println("Il risultato dell'espressione in memoria è: "+risultato);
	}

}
