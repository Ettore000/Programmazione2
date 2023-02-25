package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Moto extends Veicolo {
	public Moto(String nome, String modello, int velocitaMassima, int numeroRuote, String tipoMotore) {
		super(nome, modello, velocitaMassima);
		this.numeroRuote = numeroRuote;
		this.tipoMotore = tipoMotore;
	}
	
	public int getNumeroRuote() {
		return numeroRuote;
	}
	public String getTipoMotore() {
		return tipoMotore;
	}
	
	public void print() {
		System.out.println("Nome: "+getNome());
		System.out.println("Modello: "+getModello());
		System.out.println("Velocità massima: "+getVelocitaMassima());
		System.out.println("Numero ruote: "+numeroRuote);
		System.out.println("Tipo motore: "+tipoMotore);
	}
	
	private int numeroRuote;
	private String tipoMotore;
}
