package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.HashMap;
import java.util.Map;

public class Azienda {
	/*
	 *	Salve,
	 *	il programma, che mi ha inviato nella sua email del 12, è incompleto.
	 *	Solo il contenuto della classe Libro può essere considerato corretto,
	 *	anche se non implementa tutti i metodi necessari.
	 *
	 *	La classe Transazione deve essere superclasse di due
	 *	sottoclassi: TransazioneOnLine e TransazioneFisica. Quindi bisogna
	 *	rivedere l’implementazione.
	 *
	 *	Infine, la classe Azienda dovrebbe modellare un’azienda che vende libri
	 *	mediante transazioni fisiche e transazioni online, ovvero deve essere
	 *	rappresentata da una collezione di transazioni e una di libri, entrambi
	 *	costruiti leggendo le informazioni da file. Quindi la classe deve avere
	 *	un costruttore e tutti i metodi necessari per cercare o filtrare gli
	 *	oggetti ed eseguire altre operazioni.
	 *	
	 *	Come le dicevo è meglio svolgere prima delle tracce più semplici e
	 *	sviluppae dei programmi completi e poi passare a quelli più complessi.
	 *	
	 *	Buon lavoro
	 *	Maria Tortorella
	 */

	//TODO come risolvere il problema con l'inserimento dei double
	public Azienda() {
		this.transazioni=new HashMap<String, Transazione>();
		this.libri=new HashMap<String, Libro>();
	}

	public Map<String, Transazione> getTransazioni() {
		return transazioni;
	}
	
	public Map<String, Libro> getLibri() {
		return libri;
	}

	public void addTransazioni(String id, Transazione transazione) {
		transazioni.put(id, transazione);
	}
	
	public void addLibri(String id, Libro libro) {
		libri.put(id, libro);
	}

	private Map<String, Transazione> transazioni;
	private Map<String, Libro> libri;
}
