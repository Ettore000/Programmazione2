package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Auto extends Veicolo {
	public Auto(String nome, String modello, int velocitaMassima, int numeroPorte, String tipoAlimentazione) {
		super(nome, modello, velocitaMassima);
		this.numeroPorte = numeroPorte;
		this.tipoAlimentazione = tipoAlimentazione;
	}
	
	public int getNumeroPorte() {
		return numeroPorte;
	}
	public String getTipoAlimentazione() {
		return tipoAlimentazione;
	}
	
	public void print() {
		System.out.println("Nome: "+getNome());
		System.out.println("Modello: "+getModello());
		System.out.println("Velocità massima: "+getVelocitaMassima());
		System.out.println("Numero porte: "+numeroPorte);
		System.out.println("Tipo alimentazione: "+tipoAlimentazione);
	}
	
	private int numeroPorte;
	private String tipoAlimentazione;
}
