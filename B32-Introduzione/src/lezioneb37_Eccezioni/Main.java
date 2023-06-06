/* Lezione 37
 * - Exception handling
 * 
 * - esempi con ArithmeticException e InputMismatchException
 * - try, catch e finally
 */

package lezioneb37_Eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Inserire primo numero: ");
			int x = sc.nextInt();
			System.out.println("Inserire secondo numero: ");
			int y = sc.nextInt();
			int risultato = x / y;
			System.out.println("Risultato: " + risultato);
		} catch (ArithmeticException e) {
			System.err.println("Non puoi dividere per zero");
			//arrivato qui, il programma non si blocca
			//il programma non viene interrotto se si gestisce in questo modo l'exception
		} catch (InputMismatchException e) {
			System.err.println("Non puoi dividere un numero per una stringa");
			//Il programma non si arresta e continua nelle successive linee di codice
		} catch (Exception e) {
			System.err.println("C'è stato un problema");
		} finally {
			System.out.println("Eseguito comunque");
			sc.close();
		}
	}

}
