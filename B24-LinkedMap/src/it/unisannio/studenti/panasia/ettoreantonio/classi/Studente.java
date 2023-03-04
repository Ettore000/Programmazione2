package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Studente {
	public Studente(String nome, String cognome, double media) {
		this.nome = nome;
		this.cognome = cognome;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public double getMedia() {
		return media;
	}

	private String nome, cognome;
	private double media;
}
