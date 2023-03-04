package it.unisannio.studenti.panasia.ettoreantonio.classi;

public abstract class Veicolo {
	public String getTipoVeicolo() {
		return tipoVeicolo;
	}
	
	public abstract double calcolaPedaggio(double distanza);

	protected String tipoVeicolo;
}
