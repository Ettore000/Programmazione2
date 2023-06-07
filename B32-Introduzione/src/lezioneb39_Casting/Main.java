/* Lezione 39
 * - casting
 * 
 * - il casting è quel processo che modifica un tipo di dato
 * - implicito: automatico, quando passiamo ad un tipo più ampio (int->double, float->double)
 * - esplicito: manuale, quando passiamo ad un tipo più ristretto
 */

package lezioneb39_Casting;

public class Main {

	public static void main(String[] args) {
		//implicito
		double x=9; //abbiamo assegnato un intero
		
		System.out.println(x); //stampa un double
		
		//esplicito
		int y=(int) 9.5f;
		
		System.out.println(y);
	}

}
