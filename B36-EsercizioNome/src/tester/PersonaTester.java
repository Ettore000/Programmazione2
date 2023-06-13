package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import classi.Persona;

/**
 * Test driver della classe Persona
 */
public class PersonaTester {

	public static void main(String[] args) throws FileNotFoundException {
		//crea nuova istanza
		Persona persona=new Persona("Sig.", "Rossi", "Luca");

		//stampa su schermo
		System.out.println(persona.getTitolo()+" "+persona.getCognome()+" "+persona.getNome());
		System.out.println(persona.getTitolo()+" "+persona.getIiniziali());

		//Scrittura su file
		PrintStream ps=new PrintStream(new File("nomi.txt"));

		Persona p1=new Persona("Sig.", "Rossi", "Mario");
		Persona p2=new Persona("Sig.", "Verdi", "Marco");
		Persona p3=new Persona("Sig.na", "Neri", "Anna");

		p1.print(ps);
		p2.print(ps);
		p3.print(ps);

		Persona persona2=Persona.read();

		System.out.println(persona2.toString());


		//Input da file
		Scanner sc=new Scanner(new File("nomi.txt"));
		Persona persona3=Persona.read(sc); //legge la prima istanza nel file

		//finché ci sono dati nel file di ingresso
		//read/process loop pattern
		while (persona3!=null) {
			System.out.println(persona3.toString()); //stampa l'istanza letta
			persona3=Persona.read(sc); //legge le istanze successive alla prima
		}
	}

}
