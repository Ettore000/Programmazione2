package classi;

import java.util.ArrayList;

public class Museo {
	public Museo() {
		this.libri=new ArrayList<Libro>();
		this.stampe=new ArrayList<Stampa>();
		this.opereMultimediali=new ArrayList<OperaMultimediale>();
	}
	/*
	 * Un museo ha organizzato il proprio archivio in tre File, come segue:
			Libri				(Autore	//	Titolo	//	anno		//	collocazione)
			Stampe				(Autore	//	Titolo	//	tecnica		//	anno	//	collocazione)
			Opere Multimediali	(Autore	//	Titolo	//	supporto	//	anno	//	collocazione)
	 */
	
	/*
	 * Scrivere un programma che consenta la ricerca per:
			autore
			titolo
			anno
			una qualsiasi combinazione di tali fattori
	 */
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	public ArrayList<Stampa> getStampe() {
		return stampe;
	}
	public ArrayList<OperaMultimediale> getOpereMultimediali() {
		return opereMultimediali;
	}
	
	public static ArrayList<Libro> cercaLibri(String criterio, String valore) {
		boolean trovato=false;
		Libro l;
		int i=0;
		
		//TODO
	}
	private ArrayList<Libro> libri;
	private ArrayList<Stampa> stampe;
	private ArrayList<OperaMultimediale> opereMultimediali;
}
