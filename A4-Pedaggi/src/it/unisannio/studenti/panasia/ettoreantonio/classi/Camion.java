package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Camion extends Veicolo {
	public Camion(int numAssi, double peso) {
		this.tipoVeicolo="camion";
		this.numAssi = numAssi;
		this.peso = peso;
	}
	
	@Override
	public double calcolaPedaggio(double distanza) {
		double pedaggio=distanza*1.5;
		
		if(numAssi>2)pedaggio+=(numAssi-2)*0.5;
		if(peso>10)pedaggio+=(peso-10)*0.2;
		
		return pedaggio;
	}
	
	private int numAssi;
	private double peso;
}
