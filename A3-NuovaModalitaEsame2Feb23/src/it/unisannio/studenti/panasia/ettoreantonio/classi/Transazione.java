package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.HashMap;
import java.util.Map;

public abstract class Transazione {
	public Transazione(int id, String data) {
		this.id = id;
		this.data = data;
		this.libri = new HashMap<String, Libro>();
	}
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public Map<String, Libro> getLibri() {
		return libri;
	}

	public void addLibri(String chiave, Libro libro) {
		libri.put(chiave, libro);
	}

	//TODO
	/*public double costoTotale() {
		double costoTotale=0;

		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo();

		return costoTotale;
	}*/

	private int id;
	private String data;
	private Map<String, Libro> libri;
}