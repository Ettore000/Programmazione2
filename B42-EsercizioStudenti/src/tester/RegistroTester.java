package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import classi.Registro;
import classi.Studente;
import util.Costante;

/**
 * Test driver della classe Registro
 */
public class RegistroTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Registro registro=new Registro(new Scanner(new File(Costante.FILE_STUDENTI)), new Scanner(new File(Costante.FILE_ESAMI)));
		
		//i file devono essere già popolati
		registro.print(); //stampa tutti gli oggetti
		
		//visualizza su schermo le informazioni sullo studente e la lista degli esami svolti
		System.out.println("\n---Informazioni studente 863002805---\n");
		Studente s=registro.findStudenteByMatricola("863002805");
		s.print();
		System.out.println(s.getEsami());
		System.out.println(s.getNome()+" "+s.getCognome()+" ha una media di: "+registro.filterEsamiByMatricolaStudente(s.getMatricola()).getVotoMedio()+"/30");
		System.out.println("il suo voto massimo e': "+registro.filterEsamiByMatricolaStudente(s.getMatricola()).getVotoMassimo());
		System.out.println("il suo voto minimo e': "+registro.filterEsamiByMatricolaStudente(s.getMatricola()).getVotoMinimo());
		
		//Visualizza su schermo informazioni sullo studente e la lista degli esami svolti
		System.out.println("\n---Studente Ettore Panasia---\n");
		registro.filterStudentiByCognome("Panasia").filterStudentiByNome("Ettore").print();
		
		System.out.println("\n---Esami con voto inferiore a 24---\n");
		registro.filterEsamiByVotoInf(24).print();
		
		System.out.println("\n---Esami con voto superiore a 24---\n");
		registro.filterEsamiByVotoSup(24).print();
		
		System.out.println("\n---Esami di Fisica---\n");
		registro.filterEsamiByMateria("Fisica").print();
		
		//Ordinamento
		System.out.println("\n---Ordinamento studenti per cognome---\n");
		registro.sortStudentiByCognome();
		
		System.out.println("\n---Ordinamento studenti per numero di esami superati---\n");
		registro.sortStudentiByNumeroEsamiSuperati();
		
		System.out.println("\n---Ordinamento esami per materia---\n");
		registro.sortEsamiByMateria();
		
		//Calcoli
		System.out.println("\nVoto massimo registrato: "+registro.getVotoMassimo());
		System.out.println("Voto minimo registrato: "+registro.getVotoMinimo());
		System.out.println("Media dei voti totali di tutti gli studenti: "+registro.getVotoMedio());
		
		
	}

}
