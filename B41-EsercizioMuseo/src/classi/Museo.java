package classi;

import java.util.ArrayList;

/**
 * Museo: modella un museo che gestisce libri, stampe e opere multimediali
 */
public class Museo {
	/**
	 * Crea un museo
	 */
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
	
	/**
	 * Ottiene la collezzione di libri
	 * @return libri
	 */
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	/**
	 * Ottiene la collezione di stampe
	 * @return stampe
	 */
	public ArrayList<Stampa> getStampe() {
		return stampe;
	}
	
	/**
	 * Ottiene la collezione di opere multimediali
	 * @return
	 */
	public ArrayList<OperaMultimediale> getOpereMultimediali() {
		return opereMultimediali;
	}
	
	/**
	 * Cerca libri in base al criterio e al valore specificato
	 * @param criterio: autore, titolo, anno...
	 * @param valore: chi, come si chiama, che anno
	 * @return
	 */
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
