package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.IOException;
import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Libro;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Transazione;
import it.unisannio.studenti.panasia.ettoreantonio.classi.TransazioneFisica;

public class CreaTransazioneFisica {

	public static void main(String[] args) throws IOException {
		//Definisce una nuova transazione
		
		//Creazione istanze
		//Scanner viene istanziato qui perché così può essere chiuso come ultima operazione direttamente in questa classe, prima della terminazione del programma
		Scanner sc=new Scanner(System.in);
		Transazione transazione=TransazioneFisica.read(sc);
		Libro libro=Libro.read(sc);
		
		//Memorizza l'istanza
		transazione.addLibri(libro.getTitolo(), libro);
		
		//Stampa l'istanza
		System.out.println("Istanza inserita: ");
		transazione.print();
		
		//Chiusura dello Scanner
		sc.close();
		
		System.out.println("***Scenario concluso con successo***");
	}

}
