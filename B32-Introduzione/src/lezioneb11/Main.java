/*Lezione 11
 * - condizioni con IF
 * 
 * - IF
 * - ELSE
 * - ELSE IF
 * - IF annidati
 * - ternary operator
 */

package lezioneb11;

public class Main {

	public static void main(String[] args) {
		boolean isOnline=true;
		String nome="Marco";
		int numero=3;
		
		if (isOnline) {
			System.out.println("è online"); //se è vero che isOnline è true
		}
		
		//IF ELSE IF
		if(nome=="Luca") {
			System.out.println("è Luca");
		} else if(nome=="Andrea") {
			System.out.println("è Andrea");
		} else {
			System.out.println("è qualcun altro");
		}
		
		//IF annidati
		if(numero<10) {
			System.out.println("è minore di 10");
			if(numero%2==0) { //se è pari
				System.out.println("è pari");
			} else {
				System.out.println("è dispari");
			}
		} else {
			System.out.println("non è minore di 10");
		}
		
		//ternary operator
		String x=3<10?"ciao":"buongiorno";
		System.out.println(x);
	}

}
