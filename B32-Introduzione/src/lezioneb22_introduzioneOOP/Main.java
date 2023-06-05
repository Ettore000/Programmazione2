/* Lezione 22
 * - Introduzione OOP
 * 
 * - cos'è la programmazione ad oggetti
 * - classi, metodi e attributi
 * - classe con file esterno
 * - cosa sono gli oggetti e le distanze di classe
 * - usare attributi e metodi
 */

package lezioneb22_introduzioneOOP;

public class Main {

	public static void main(String[] args) {
		//due persone diverse che si chiamano Luca
		Persona persona1=new Persona(); //prima istanza
		Persona persona2=new Persona(); //seconda istanza
		
		System.out.println(persona1.nome);
		System.out.println(persona1.colorePreferito);
		
		System.out.println(persona2.nome);
		System.out.println(persona2.colorePreferito);
		
		persona1.cammina();
		persona1.saluta();
		
		persona2.cammina();
		persona2.saluta();
	}

}
