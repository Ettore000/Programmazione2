package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.FileNotFoundException;
import java.io.IOException;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Azienda;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Transazione;
import it.unisannio.studenti.panasia.ettoreantonio.util.Costante;

public class StampaElencoTransazioni {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		/*
		 * Stampa l'elenco delle transazioni riportando:
		 * ID Data Citta IP Totale
		 * con Totale = totale costo della transazione
		 */
		//pppprova
		
		Azienda azienda=new Azienda();
		Transazione transazione = Transazione.read(Costante.TRANSAZIONE);
		//for(azienda: azienda.getTransazioni().values())System.out.println(transazione);
		System.out.println("***Scenario concluso con successo***");
	}
}