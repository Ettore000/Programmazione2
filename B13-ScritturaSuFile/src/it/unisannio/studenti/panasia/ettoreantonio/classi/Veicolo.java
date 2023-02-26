package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Veicolo {
	public Veicolo(String marca, String modello, int anno, double prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.prezzo = prezzo;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public int getAnno() {
		return anno;
	}
	public double getPrezzo() {
		return prezzo;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("Marca: "+marca+"\n");
		sb.append("Modello: "+modello+"\n");
		sb.append("Anno: "+anno+"\n");
		sb.append("Prezzo: "+prezzo);
		
		return sb.toString();
	}
	
	private String marca, modello;
	private int anno;
	private double prezzo;
}
