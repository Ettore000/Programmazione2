/* Lezione 32
 * - Modificatori di accesso
 * 
 * - modificatori di accesso servono per aggiungere un livello di sicurezza aggiuntivo
 * - creare 2 package con 2 classi
 * 
 * 				class	package		subclass	world
 * - public		si		si			si			si
 * - protected	si		si			si			no
 * - default	si		si			no			no
 * - private	si		no			no			no
 */

package lezioneb32_modificatoriDiAccesso.pacchetto1;

import lezioneb32_modificatoriDiAccesso.pacchetto2.B;

public class Main {

	public static void main(String[] args) {
		B prova=new B();
		
		System.out.println(prova.nome);
	}

}
