package it.unisannio.studenti.panasia.ettoreantonio.classi;

public abstract class Veicolo {
	public Veicolo(String nome, String modello, int velocitaMassima) {
		this.nome = nome;
		this.modello = modello;
		this.velocitaMassima = velocitaMassima;
	}
	
	public String getNome() {
		return nome;
	}
	public String getModello() {
		return modello;
	}
	public int getVelocitaMassima() {
		return velocitaMassima;
	}
	
	public abstract void print();

	private String nome, modello;
	private int velocitaMassima;
}