/* Lezione 10
 * - operatori logici
 * 
 * - operatori: AND &&, OR ||, NOT !
 */

package lezioneb10_AND_OR_NOT;

public class Main {

	public static void main(String[] args) {
		boolean x = 3<10 && 3%2==0; //AND
		System.out.println(x);
		
		boolean y = 3<10 || 3%2==0; //OR
		System.out.println(y);
		
		System.out.println(!y); //NOT
	}

}
