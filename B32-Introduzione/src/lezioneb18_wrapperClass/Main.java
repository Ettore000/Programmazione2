/* Lezione 18
 * - Wrapper class
 * 
 * - le wrapper class permettono di utilizzare dati primitivi come reference
 * - boolean	->	Boolean
 * - char		->	Character
 * - int		->	Integer
 * - double		->	Double
 */

package lezioneb18_wrapperClass;

public class Main {

	public static void main(String[] args) {
		//tramite queste implementazioni possiamo ottenere dei metodi a cui le primitive non hanno accesso
		//le classi wrapper abbassano le prestazioni del codice, infatti dovrebbero essere usate solo quando servono
		//perché le wrapper scompattano l'informazione in primitiva e poi ricompattano per ottenere determinati metodi
		//fenomeno di auto-boxing auto-unboxing
		Boolean vero=true;
		Character carattere='a';
		Integer numero=5;
		Double virgole=5.23;
		String stringa="bel corso";
		
		boolean a=true;
		char b='a';
		int c=5;
		double d=5.23;
		String e="bel corso";
		
		if(vero==a) {
			System.out.println("ciao");
		}
		if(carattere==b) {
			System.out.println("ciao");
		}
		if(numero==c) {
			System.out.println("ciao");
		}
		if(virgole==d) {
			System.out.println("ciao");
		}
		if(stringa==e) {
			System.out.println("ciao");
		}
	}

}
