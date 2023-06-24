package tester;

import classi.Esame;
import classi.Studente;

/**
 * Test driver della classe studente
 */
public class StudenteTester {
	public static void main(String[] args) {
		//input da tastiera
		Studente studente=Studente.read(); //inserimento studente da tastiera
		studente.addEsame(Esame.read()); //inserimento esame da tastiera
		
		System.out.println("Nome: "+studente.getNome());
		System.out.println("Cognome: "+studente.getCognome());
		System.out.println("Matricola: "+studente.getMatricola());
		System.out.println("Numero esami: "+studente.getNumeroEsami());
		System.out.println("Lista esami: "+studente.getEsami());
		
		Esame esame=studente.getEsami().get(0); //individuazione esame
		studente.removeEsame(esame); //rimozione esame
		System.out.println("Numero esami dopo la rimozione: "+studente.getNumeroEsami());
		System.out.println("Lista esami dopo la rimozione: "+studente.getEsami());
		
		studente.print(); //visualizzazione generica su schermo
		
		System.out.println(studente.toString()); //visualizzazione su schermo dell'oggetto
		
		System.out.println(studente.hashCode()); //visualizzazione su schermo dell'identificatre univoco dell'oggetto
	}

}
