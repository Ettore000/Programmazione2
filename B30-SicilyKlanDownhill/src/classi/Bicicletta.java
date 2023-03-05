package classi;

public class Bicicletta {
	public Bicicletta(String marca, String modello, String colore, int ruote) {
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.ruote = ruote;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public String getColore() {
		return colore;
	}
	public int getRuote() {
		return ruote;
	}

	private String marca, modello, colore;
	private int ruote;
}
