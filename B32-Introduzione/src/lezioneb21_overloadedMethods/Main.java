/* Lezione 21
 * - Overloaded methods
 * 
 * - cosa sono
 * - metodi con lo stesso nome, utilizzabili in modo diverso
 * - creiamo diversi metodi con numero di parametri differente
 * - creiamo diversi metodi con tipi di dato differenti
 */

package lezioneb21_overloadedMethods;

public class Main {

	public static void main(String[] args) {
		int doppioInt=addizione(2,3);
		int triploInt=addizione(5,10,9);
		double doppioDouble=addizione(2.5,6.3);
		
		System.out.println(doppioInt);
		System.out.println(triploInt);
		System.out.println(doppioDouble);
	}
	
	static int addizione(int a, int b) {
		int risultato=a+b;
		
		return risultato;
	}
	
	//overloading con numero diverso di parametri
	static int addizione(int a, int b, int c) {
		int risultato=a+b;
		
		return risultato;
	}
	
	//overloading con tipi diversi di dati
	static double addizione(double a, double b) {
		double risultato=a+b;
		
		return risultato;
	}

}
