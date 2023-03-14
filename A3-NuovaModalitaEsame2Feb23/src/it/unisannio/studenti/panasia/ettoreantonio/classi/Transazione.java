package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public abstract class Transazione {
	public Transazione(int id, String data) {
		this.id=id;
		this.data=data;
		this.transazioniOnline=new HashMap<>();
		this.transazioniFisiche=new HashMap<>();
	}

	public int getId(){return id;}
	public String getData(){return data;}
	public Map<String, TransazioneOnline> getTransazioniOnline(){return transazioniOnline;}
	public Map<String, TransazioneFisica> getTransazioniFisiche(){return transazioniFisiche;}
	public abstract Map<String, Libro> getLibri();
	public abstract void addLibri(Libro libro);
	public abstract double costoTotale();
	public abstract void print();
	public abstract void printFile(PrintStream nomeFile);

	private int id;
	private String data;
	private Map<String, TransazioneOnline> transazioniOnline;
	private Map<String, TransazioneFisica> transazioniFisiche;
}