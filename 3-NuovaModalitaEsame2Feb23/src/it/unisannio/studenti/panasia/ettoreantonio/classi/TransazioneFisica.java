package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class TransazioneFisica extends Transazione {
	public TransazioneFisica(int id, String data, String citta) {
		super(id, data);
		this.citta = citta;
	}

	public String getCitta() {
		return citta;
	}

	private String citta;
}
