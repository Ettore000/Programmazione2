package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.HashMap;
import java.util.Map;

public class Azienda {
	public Azienda() {
		this.transazioni=new HashMap<Integer, Transazione>();
		this.libri=new HashMap<String, Libro>();
	}

	//Getters
	public Map<Integer, Transazione> getTransazioni(){return transazioni;}
	public Map<String, Libro> getLibri(){return libri;}

	//Aggiunta
	public void addTransazioni(Transazione transazione) {transazioni.put(transazione.getId(), transazione);}
	public void addLibri(Libro libro){libri.put(libro.getTitolo(), libro);}

	//Ricerca
	public Libro cercaLibro(String titolo){return libri.get(titolo);}
	public Transazione cercaTransazione(int id){return transazioni.get(id);}

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

	public Azienda filtraTransazioniPerData(String data) {
		HashMap<Integer, Transazione> risultatoT=new HashMap<Integer, Transazione>();
		HashMap<String, Libro> risultatoL=new HashMap<String, Libro>();
			for (Integer id:transazioni.keySet()) {
			Transazione transazione=transazioni.get(id);
			if (transazione.getData().equalsIgnoreCase(data)) { //si utilizza equalsIgnoreCase() per confrontare due stringhe ignorando le differenze tra lettere maiuscole e minuscole
				risultatoT.put(id, transazione);
				risultatoL.putAll(transazione.getLibri());
			}
		}
		return new Azienda(risutatoT, risultatoL);
	}

	public HashMap<String, Libro> filtraLibriPerAutore(String autore) {
		HashMap<String, Libro> risultato=new HashMap<String, Libro>();
		for (String titolo:libri.keySet()) {
			Libro libro=libri.get(titolo);
			if (libro.getAutore().equalsIgnoreCase(autore)) {
				risultato.put(titolo, libro);
			}
		}
		return risultato;
	}

	//Rimozione
	public void rimuoviTransazione(int id) {
		Transazione transazione = cercaTransazione(id);
		if (transazione != null)transazioni.remove(transazione.getId());
	}

	private Map<Integer, Transazione> transazioni;
	private Map<String, Libro> libri;
}
