/* Lezione 6
 * - User input
 * 
 * - importare java.util.Scanner
 * - creare oggetto Scanner
 * - creare domande per utente: nome, cognome, eta, citta
 */

package lezione6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual'è il tuo nome?");
		String nome = sc.nextLine();
		
		System.out.println("Qual'è il tuo cognome?");
		String cognome = sc.nextLine();
		
		System.out.println("Qual'è la tua età?");
		int eta = sc.nextInt();sc.nextLine();
		
		System.out.println("In che città vivi?");
		String citta = sc.nextLine();
		
		System.out.println("Ciao "+nome+" "+cognome);
		System.out.println("Hai "+eta+" anni");
		System.out.println("Vivi a "+citta);

	}

}
