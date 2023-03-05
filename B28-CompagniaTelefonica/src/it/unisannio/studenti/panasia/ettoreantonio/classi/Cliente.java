package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Cliente {
	public Cliente(String nome, String cognome, PianoTariffario pianoTariffario) {
		this.nome = nome;
		this.cognome = cognome;
		this.pianoTariffario = pianoTariffario;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public PianoTariffario getPianoTariffario() {
		return pianoTariffario;
	}
	
	public double calcolaCostoMensile(int minutiUsati, int smsUsati, int gigaUsati) {
		int minutiExtra=Math.max(minutiUsati-pianoTariffario.getMinutiInclusi(), 0); //se non sono stati utilizzati i minuti extra il risultato della differenza è minore di zero, quindi il metodo restituisce 0
		int smsExtra=Math.max(smsUsati-pianoTariffario.getSmsInclusi(), 0);
		int gigaExtra=Math.max(gigaUsati-pianoTariffario.getGigaInclusi(), 0);
		
		double costoMinutiExtra=minutiExtra*0.1;
		double costoSmsExtra=smsExtra*0.05;
		double costoGigaExtra=gigaExtra*2;
		
		double costoMensile=pianoTariffario.getPrezzoMensile()+costoMinutiExtra+costoSmsExtra+costoGigaExtra;
		
		return costoMensile;
	}
	
	private String nome, cognome;
	private PianoTariffario pianoTariffario;
}
