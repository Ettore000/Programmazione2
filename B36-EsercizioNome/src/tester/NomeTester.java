package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import classi.Nome;

/**
 * NomeTester: test driver della classe Nome
 */
public class NomeTester {

	public static void main(String[] args) throws FileNotFoundException {
		//crea nuova istanza
		Nome nome=new Nome("Luca", "Rossi", "Sig.");

		//stampa su schermo
		System.out.println(nome.getTitolo()+" "+nome.getCognome()+" "+nome.getNome());
		System.out.println(nome.getTitolo()+" "+nome.getIiniziali());

		//Scrittura su file
		PrintStream ps=new PrintStream(new File("nomi.txt"));

		Nome n1=new Nome("Sig.", "Rossi", "Mario");
		Nome n2=new Nome("Sig.", "Verdi", "Marco");
		Nome n3=new Nome("Sig.na", "Neri", "Anna");

		n1.print(ps);
		n2.print(ps);
		n3.print(ps);

		Nome nome2=Nome.read();

		System.out.println(nome2.toString());


		//Input da file
		Scanner sc=new Scanner(new File("nomi.txt"));
		Nome nome3=Nome.read(sc); //legge la prima istanza nel file

		//finché ci sono dati nel file di ingresso
		//read/process loop pattern
		while (nome3!=null) {
			System.out.println(nome3.toString()); //stampa l'istanza letta
			nome3=Nome.read(sc); //legge le istanze successive alla prima
		}
	}

}
