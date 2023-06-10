/**
 * Test driver della classe Nome
 */

package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import classi.Nome;

public class NomeTester {

	public static void main(String[] args) {
		//Stampa nel display
		Nome nome=new Nome("Luca", "Rossi", "Sig.");

		System.out.println(nome.getTitolo()+" "+nome.getCognome()+" "+nome.getNome());
		System.out.println(nome.getTitolo()+" "+nome.getIiniziali());

		//Scrittura nel file
		try {
			PrintStream ps=new PrintStream(new File("nomi.txt"));

			Nome n1=new Nome("Sig.", "Rossi", "Mario");
			Nome n2=new Nome("Sig.", "Verdi", "Marco");
			Nome n3=new Nome("Sig.na", "Neri", "Anna");

			n1.print(ps);
			n2.print(ps);
			n3.print(ps);
		} catch (FileNotFoundException e) {
			System.err.println("Il file dove scrivere non è stato trovato");
		}

		//Input da tastiera
		//TODO
		//perché non parte il NullPointerException dentro la classe Nome nel metodo read()?
		/* Si potrebbe mettere all'interno del metodo Nome read() invece
		 * di return null, return new Nome(titolo, cognome, nome), perché tanto le variabili sono inizializzate come
		 * "non determinabile" oppure ""
		 * 
		 * in questo modo non si dovrebbe nemmeno gestire NullPointerException
		 */
		Nome nome2=Nome.read();

		try {
			System.out.println(nome2.toString());
		} catch (NullPointerException e) {
			System.err.println("Sono io");
		}


		//Input da file
		try {
			Scanner sc=new Scanner(new File("nomi.txt"));
			Nome nome3=Nome.read(sc); //legge la prima istanza nel file

			//finché ci sono dati nel file di ingresso
			//read/process loop pattern
			//TODO perché non legge Anna? l'ultima riga nel file?
			while (nome3!=null) {
				System.out.println(nome3.toString()); //stampa l'istanza letta
				nome3=Nome.read(sc); //legge le istanze successive alla prima
			}
		} catch (FileNotFoundException e) {
			System.err.println("Il file da dove leggere non è stato trovato");
		}
	}

}
