package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Transazione {
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

	//TODO calola il costo totale di una transazione
	/*public double costoTotale() {
		double costoTotale=0;

		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo();

		return costoTotale;
	}*/
	
	public void print() {
		//Implementato nelle sottoclassi
	}
	
	//TODO Legge il contenuto di un File
	public static TransazioneFisica readFile(Scanner sc){
		if(!sc.hasNextInt())return null;
		int id=sc.nextInt();

		if(!sc.hasNext())return null;
		String data=sc.next();

		if(!sc.hasNext())return null;
		String citta=sc.next();

		return new TransazioneFisica(id, data, citta);
	}

	private int id;
	private String data;
	private Map<String, Libro> libri;
}