/* Lezione 16
 * - array 2D
 * 
 * - cosa sono gli array 2D
 * - creare un array 2D in entrambi i modi
 * - accedere agli elementi degli array
 * - ciclare con for
 */

package lezioneb16_array2D;

public class Main {

	public static void main(String[] args) {
		//un array che contiene più array
		String[][] classi = new String[3][5]; //dichiarazione
		
		classi[0][0]="Luca"; //primo studente della prima classe
		classi[0][1]="Anna"; //secondo studente della prima classe
		classi[0][2]="Marco"; //terzo studente della prima classe
		
		classi[1][0]="Edoardo";
		classi[1][1]="Leonardo";
		classi[1][2]="Antonio";
		
		classi[2][0]="Arianna";
		classi[2][1]="Paolo";
		classi[2][2]="Andrea";
		
		for (int classe = 0; classe < classi.length; classe++) {
			System.out.println();
			for (int studente = 0; studente < classi[classe].length; studente++) {
				System.out.print(classi[classe][studente]+" ");
			}
		}
		
		//oppure con foreach
		for (String[] classe : classi) {
			System.out.println();
			for (String studente : classe) {
				System.out.print(studente+" ");
			}
		}
	}

}
