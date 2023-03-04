package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Esame {
	public Esame(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public String getNome() {
		return nome;
	}
	public int getVoto() {
		return voto;
	}

	private String nome;
	private int voto;
}
