package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import java.io.IOException;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Libro;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Transazione;

public class CreaNuovaTransazione {

	public static void main(String[] args) throws IOException {
		//Definisce una nuova transazione
		
		//Crea l'istanza
		Transazione transazione=Transazione.read();
		Libro libro=Libro.read();
		
		//Memorizza l'istanza
		transazione.addLibri(libro.getTitolo(), libro);
		
		//Stampa l'istanza
		System.out.println(transazione.toString());
		
		System.out.println("***Scenario concluso con successo***");
	}

}
