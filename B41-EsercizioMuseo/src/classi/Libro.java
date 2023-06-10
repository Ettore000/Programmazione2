package classi;

import java.util.Scanner;

public class Libro {
	public Libro(String autore, String titolo, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.anno = anno;
		this.collocazione = collocazione;
	}
	
	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getCollocazione() {
		return collocazione;
	}
	public int getAnno() {
		return anno;
	}
	
	public Libro read() {
		Scanner sc=new Scanner(System.in);
		
		String autore="", titolo="", collocazione="";
		int anno=0;
		try {
			
		} catch (NullPointerException e) {
			System.err.println("I dati letti da tastiera non sono conformi");
		}
		return new Libro(autore, titolo, anno, collocazione);
	}

	private String autore, titolo, collocazione;
	private int anno;
}
