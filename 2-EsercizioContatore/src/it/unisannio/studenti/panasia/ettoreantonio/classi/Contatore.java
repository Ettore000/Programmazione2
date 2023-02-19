package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Contatore {
	public Contatore(int conta) {
		this.conta=conta;
	}
	
	public int getConta() {
		return conta;
	}
	
	public int incrementaConta() {
		return ++conta; //++ si mette prima dell'identificatore perché così il numero prima viene incrementato e poi ritornato
	}
	public int decrementaConta() {
		return --conta;
	}
	
	private int conta;
}
