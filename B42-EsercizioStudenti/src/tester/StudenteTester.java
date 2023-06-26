package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import classi.Esame;
import classi.Studente;
import util.Costante;

/**
 * Test driver della classe studente
 */
public class StudenteTester {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//input da tastiera
		Studente s1=Studente.read(); //inserimento studente da tastiera
		s1.addEsame(Esame.read()); //inserimento esame da tastiera

		System.out.println("Nome="+s1.getNome());
		System.out.println("Cognome="+s1.getCognome());
		System.out.println("Matricola="+s1.getMatricola());
		System.out.println("Numero esami="+s1.getNumeroEsami());
		System.out.println("Lista esami="+s1.getEsami());

		Esame e1=s1.getEsami().get(0); //individuazione esame
		s1.removeEsame(e1); //rimozione esame
		System.out.println("Numero esami dopo la rimozione="+s1.getNumeroEsami());
		System.out.println("Lista esami dopo la rimozione="+s1.getEsami());

		s1.print(); //visualizzazione generica su schermo

		System.out.println(s1.toString()); //visualizzazione su schermo dell'oggetto

		System.out.println("HashCode s1="+s1.hashCode()); //visualizzazione su schermo dell'identificatre univoco dell'oggetto

		s1.print(new PrintStream(Costante.FILE_STUDENTI)); //scrittura su file

		//input da file
		Studente s2=Studente.read(new Scanner(new File(Costante.FILE_STUDENTI))); //lettura studente da file
		System.out.println("-------------------------------");
		System.out.println(s2.toString());
		System.out.println("HashCode s2="+s1.hashCode());

		//confronto
		System.out.println(s1.equals(s2)); //se sono uguali restituisce true
		System.out.println(s1.compareTo(s2)); //restituisce -1, 0 e 1 a seconda dell'ordinamento
	}

}
