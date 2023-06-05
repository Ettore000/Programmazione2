/* Lezione 20
 * - Metodi
 * 
 * - cosa sono i metodi
 * - creiamo un semplice metodo void
 * - parametri dei metodi
 * - il return
 */

package lezioneb20_metodi;

public class Main {

	public static void main(String[] args) {
		faiPasta();
		cucinaPranzo("carne");
		addizione(2, 3);
		int totaleSpesa1=calcolaSpesa(10, 15, 20);
		int totaleSpesa2=calcolaSpesa(20, 45, 61);
		System.out.println(totaleSpesa1);
		System.out.println(totaleSpesa2);
	}
	
	static void faiPasta() {
		System.out.println("Sto cucinando pasta");
	}
	
	static void cucinaPranzo(String cibo) {
		System.out.println("Sto cucinando "+cibo);
	}
	
	static void addizione(int a, int b) {
		int risultato=a+b;
		System.out.println(risultato);
	}
	
	static int calcolaSpesa(int a, int b, int c) {
		int risultato=a+b+c;
		
		return risultato;
	}
}
