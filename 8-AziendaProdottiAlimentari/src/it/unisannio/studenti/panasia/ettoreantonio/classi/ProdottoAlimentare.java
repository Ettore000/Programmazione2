package it.unisannio.studenti.panasia.ettoreantonio.classi;

public abstract class ProdottoAlimentare {
	public ProdottoAlimentare(String nome, double prezzo) {
		this.nome=nome;
		this.prezzo=prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public abstract void descrizioneProdotto();
	
	private String nome;
	private double prezzo;
}
