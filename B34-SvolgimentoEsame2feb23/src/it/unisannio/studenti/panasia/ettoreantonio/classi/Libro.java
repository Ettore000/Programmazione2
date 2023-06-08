package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Libro {
	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public String getAutore() {
		return autore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	
	private String titolo, autore;
	private double prezzo;
}
