package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Bicicletta extends Veicolo {
	public Bicicletta(String nome, String modello, int velocitaMassima, int numeroMarce, String tipoFreni) {
		super(nome, modello, velocitaMassima);
		this.numeroMarce = numeroMarce;
		this.tipoFreni = tipoFreni;
	}
	
	public int getNumeroMarce() {
		return numeroMarce;
	}
	public String getTipoFreni() {
		return tipoFreni;
	}
	
	public void print() {
		System.out.println("Nome: "+getNome());
		System.out.println("Modello: "+getModello());
		System.out.println("Velocita' massima: "+getVelocitaMassima());
		System.out.println("Numero marce: "+numeroMarce);
		System.out.println("Tipo freni: "+tipoFreni);
	}

	private int numeroMarce;
	private String tipoFreni;
}
