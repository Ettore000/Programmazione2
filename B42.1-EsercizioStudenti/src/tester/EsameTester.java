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
 * Test driver della classe Esame
 */
public class EsameTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//input da tastiera
		Esame e1=Esame.read();
		Studente s=Studente.read(new Scanner(new File(Costante.FILE_STUDENTI))); //lettura di uno studente da file
		e1.setStudente(s); //Inserimento dello studente all'interno dell'esame

		System.out.println("Materia="+e1.getMateria());
		System.out.println("Matricola studente="+e1.getMatricolaStudente());
		System.out.println("Voto="+e1.getVoto());
		System.out.println("Studente="+e1.getStudente());

		e1.print();

		System.out.println(e1.toString());

		System.out.println("HashCode e1="+e1.hashCode());

		e1.print(new PrintStream(new File(Costante.FILE_ESAMI)));

		//input da file
		Esame e2=Esame.read(new Scanner(new File(Costante.FILE_ESAMI)));
		System.out.println("-------------------------------");
		System.out.println(e2.toString());
		System.out.println("HashCode e2="+e2.hashCode());

		//confronto
		System.out.println(e1.equals(e2)); //se sono uguali restituisce true
		System.out.println(e1.compareTo(e2)); //restituisce -1, 0 e 1 a seconda dell'ordinamento
	}

}
