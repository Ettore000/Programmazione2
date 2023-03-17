package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Transazione {
	public Transazione(int id, Date data) {
		this.id=id;
		this.data=data;
		this.libri=new HashSet<>();
	}

	public int getId(){
		return id;
	}

	public Date getData(){
		return data;
	}

	public Set<Libro> getLibri() {
		return libri;
	}

	public void addLibri(Libro libro) {
		libri.add(libro);
	}

	public double costoTotale() {
		double costoTotale=0;
		for(Libro libro:libri)costoTotale+=libro.getPrezzo();
		return costoTotale;
	}

	public abstract void print();

	public abstract void print(PrintStream ps);

	private int id;
	private Date data=new Date();
	private Set<Libro> libri;
}