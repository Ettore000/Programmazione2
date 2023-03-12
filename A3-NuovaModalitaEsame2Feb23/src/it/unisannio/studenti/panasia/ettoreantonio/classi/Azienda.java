package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.HashMap;
import java.util.Map;

public class Azienda {
	/*
	 *	Infine, la classe Azienda dovrebbe modellare un’azienda che vende libri
	 *	mediante transazioni fisiche e transazioni online, ovvero deve essere
	 *	rappresentata da una collezione di transazioni e una di libri, entrambi
	 *	costruiti leggendo le informazioni da file. Quindi la classe deve avere
	 *	un costruttore e tutti i metodi necessari per cercare o filtrare gli
	 *	oggetti ed eseguire altre operazioni.
	 */

	public Azienda() {
		this.transazioni=new HashMap<Integer, Transazione>();
		this.libri=new HashMap<String, Libro>();
	}

	public Map<Integer, Transazione> getTransazioni() {
		return transazioni;
	}

	public Map<String, Libro> getLibri() {
		return libri;
	}

	//Aggiunta
	public void addTransazioni(Transazione transazione) {
		transazioni.put(transazione.getId(), transazione);
	}

	public void addLibri(Libro libro) {
		libri.put(libro.getTitolo(), libro);
	}

	//Ricerca
	public Libro cercaLibro(String titolo) {
		return libri.get(titolo);
	}

	public Transazione cercaTransazione(int id) {
		return transazioni.get(id);
	}

	//Filtraggio
	
	//Questo metodo non si preferisce in quanto il confronto tra key dell'HashMap è molto più efficiente
	/*public HashMap<Integer, Transazione> filtraTransazioniPerData(String data) {
		HashMap<Integer, Transazione> result = new HashMap<Integer, Transazione>();
		for (Transazione transazione:transazioni.values()) {
			if (transazione.getData().equalsIgnoreCase(data)) {
				result.put(transazione.getId(), transazione);
			}
		}
		return result;
	}*/
	
	public HashMap<Integer, Transazione> filtraTransazioniPerData(String data) {
	    HashMap<Integer, Transazione> risultato = new HashMap<Integer, Transazione>();
	    for (Integer id:transazioni.keySet()) {
	        Transazione transazione = transazioni.get(id);
	        if (transazione.getData().equalsIgnoreCase(data)) { //si utilizza equalsIgnoreCase() per confrontare due stringhe ignorando le differenze tra lettere maiuscole e minuscole
	        	risultato.put(id, transazione);
	        }
	    }
	    return risultato;
	}
	
	public HashMap<String, Libro> filtraLibriPerAutore(String autore) {
	    HashMap<String, Libro> risultato = new HashMap<String, Libro>();
	    for (String titolo:libri.keySet()) {
	        Libro libro = libri.get(titolo);
	        if (libro.getAutore().equalsIgnoreCase(autore)) {
	        	risultato.put(titolo, libro);
	        }
	    }
	    return risultato;
	}

	private Map<Integer, Transazione> transazioni;
	private Map<String, Libro> libri;
}
