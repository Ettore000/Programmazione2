package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Moto extends Veicolo {
	public Moto() {
		this.tipoVeicolo="moto";
	}

	@Override
	public double calcolaPedaggio(double distanza) {
		return distanza*0.3;
	}

}
