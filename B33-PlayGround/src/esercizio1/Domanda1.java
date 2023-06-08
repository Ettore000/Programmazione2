/*
 * Scrivere una classe Domanda1 che contenga al suo interno un metodo main, nel quale si dichiari l'array di
 * interi numeri=[6,3,1,2,9] e si calcoli la media dell'array, stampandola sullo schermo.
 * Tempo: 10 minuti
 */

package esercizio1;

public class Domanda1 {
	public static void main(String[] args) {
		int[] numeri= {6,3,1,2,9};
		
		double media=0;
		int somma=0;
		for (int i=0; i<numeri.length; i++) {
			somma+=numeri[i];
		}
		media=somma/numeri.length;
		System.out.println("La media dei numeri in memoria è: "+media);
	}
}
