package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.ArrayList;

public class Libreria {
	public Libreria() {
		this.libri = new ArrayList<>();
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	public void aggiungiLibro(Libro libro) {
		libri.add(libro);
	}
	
	public void rimuoviLibro(String titolo) {
		for(Libro libro:libri) {
			if(libro.getTitolo().equals(titolo)) {
				libri.remove(libro);
			}
		}
	}
	
	public Libro cercaLibro(String titolo) {
		for(Libro libro:libri) {
			if(libro.getTitolo().equals(titolo)) {
				return libro;
			}
		}
		return null;
	}
	
	public void stampaLibri() {
		for(Libro libro:libri) {
			System.out.println(libro.getTitolo() + " di " + libro.getAutore() + " (" + libro.getAnnoPubblicazione() + ")");
		}
	}

	private ArrayList<Libro> libri;
}
