package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Auto extends Veicolo {
	public Auto() {
		this.tipoVeicolo="auto";
	}

	@Override
	public double calcolaPedaggio(double distanza) {
		return distanza*0.5;
	}

}
