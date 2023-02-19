package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.util.HashMap;
import java.util.Map;

public class Azienda {
	public Azienda() {
		this.transazioni=new HashMap<String, Transazione>();
	}
	
	public Map<String, Transazione> getTransazioni() {
		return transazioni;
	}
	
	public void addTransazioni(String id, Transazione transazione) {
		transazioni.put(id, transazione);
	}

	private Map<String, Transazione> transazioni;
}
