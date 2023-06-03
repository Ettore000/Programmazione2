/* Lezione 14
 * - i cicli for
 * 
 * - ciclo for
 * - for annidati
 * - versione enhanced/foreach
 * - break e continue
 */

package lezioneb14_cicloFor_break_continue;

public class Main {
	//mentre nel while avevamo condizioni generiche, il ciclo for passa in rassegna quello che ci serve
	public static void main(String[] args) {
		for (int i = 0; i<5; i++) { //usiamo il for quando sappiamo i cicli massimi, ovvero per un array
			System.out.println(i);
		}
		
		//for annidati
		for (int j = 0; j<5; j++) {
			System.out.println("riga "+j);
			for(int k = 0; k<5; k++) {
				System.out.println("colonna "+k);
			}
		}
		
		//enhanced for o foreach
		int[] numeri= {10, 20, 30, 40, 50};
		for (int numero : numeri) {
			System.out.println(numero);
		}
		
		//uso di break per uscire dal ciclo
		for (int i = 0; i<10; i++) {
			if(i==4)break;
			System.out.println(i);
		}
		
		//uso di continue per saltare l'iterazione
		for (int i = 0; i<10; i++) {
			if(i==4)continue; //salta una sola iterazione, quella interessata o quelle interessate
			System.out.println(i);
		}
	}

}
