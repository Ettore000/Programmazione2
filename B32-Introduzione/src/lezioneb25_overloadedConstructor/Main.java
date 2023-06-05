/* Lezione 25
 * - Overloaded constructor
 * 
 * - cosa sono
 * - creare class pizza
 * - creare multipli costruttori
 */

package lezioneb25_overloadedConstructor;

public class Main {

	public static void main(String[] args) {
		Pizza pizza1=new Pizza("integrale", "pomodoro", "mozzarella", "ananas");
		Pizza pizza2=new Pizza("5 cereali");
		Pizza pizza3=new Pizza("normale", "pomodoro", "mozzarella");
	}

}
