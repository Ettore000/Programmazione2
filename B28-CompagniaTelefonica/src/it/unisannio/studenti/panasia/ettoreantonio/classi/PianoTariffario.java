package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class PianoTariffario {
	public PianoTariffario(String nome, double prezzoMensile, int minutiInclusi, int smsInclusi, int gigaInclusi) {
		this.nome = nome;
		this.prezzoMensile = prezzoMensile;
		this.minutiInclusi = minutiInclusi;
		this.smsInclusi = smsInclusi;
		this.gigaInclusi = gigaInclusi;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPrezzoMensile() {
		return prezzoMensile;
	}
	public int getMinutiInclusi() {
		return minutiInclusi;
	}
	public int getSmsInclusi() {
		return smsInclusi;
	}
	public int getGigaInclusi() {
		return gigaInclusi;
	}
	
	private String nome;
	private double prezzoMensile;
	private int minutiInclusi, smsInclusi, gigaInclusi;
}
