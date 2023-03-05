package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Pompiere {
	public Pompiere(String nome, String cognome, int eta, int anniEsperienza) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.anniEsperienza = anniEsperienza;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public int getEta() {
		return eta;
	}
	public int getAnniEsperienza() {
		return anniEsperienza;
	}

	private String nome, cognome;
	private int eta, anniEsperienza;
}
