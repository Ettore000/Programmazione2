package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Libro {
	public Libro(String titolo, String autore, int annoPubblicazione) {
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public String getAutore() {
		return autore;
	}
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	private String titolo, autore;
	private int annoPubblicazione;
}
