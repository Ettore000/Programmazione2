package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Transazione;
import it.unisannio.studenti.panasia.ettoreantonio.util.Costante;

public class StampaElencoTransazioni {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		/*
		 * Stampa l'elenco delle transazioni riportando:
		 * ID Data Citta IP Totale
		 * con Totale = totale costo della transazione
		 */
		
		//Istanze
		Scanner sc=new Scanner(new File(Costante.TRANSAZIONE));
		Transazione transazione = Transazione.readFile(sc);
		
		//Read Loop Pattern
		//continua il read loop pattern finché non ci sono più dati nel File di ingresso
		while (transazione!=null) {
			transazione=Transazione.readFile(sc);
			System.out.println(transazione);
		}
		
		//System.out.println(transazione);
		System.out.println("***Scenario concluso con successo***");
	}
}