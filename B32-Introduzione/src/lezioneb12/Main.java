/* Lezione 12
 * - gli Switch
 */

package lezioneb12;

public class Main {

	public static void main(String[] args) {
		String nome="Luca";
		
		switch (nome) {
		case "Luca":
			System.out.println("ciao Luca");
			break;
		case "Marco":
			System.out.println("ciao Marco");
			break;
		case "Anna":
			System.out.println("ciao Anna");
			break;
		case "Antonio":
			System.out.println("ciao Antonio");
			break;
		case "Edoardo":
			System.out.println("ciao Edoardo");
			break;

		default:
			System.out.println("ciao chiunque tu sia");
			break;
		}
	}

}
