package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Transazione {
	public Transazione(int id, Date data) {
		this.id=id;
		this.data=data;
		this.libri=new HashMap<>();
	}

	public int getId(){
		return id;
	}

	public Date getData(){
		return data;
	}

	public Map<String, Libro> getLibri() {
		
	}
	public abstract void addLibri(Libro libro) {
		
	}
	
	public abstract double costoTotale() {
		
	}
	
	public abstract void print() {
		
	}
	
	public abstract void printFile(PrintStream nomeFile) {
		
	}

	private int id;
	private Date data;
	private Map<String, Libro> libri;
}