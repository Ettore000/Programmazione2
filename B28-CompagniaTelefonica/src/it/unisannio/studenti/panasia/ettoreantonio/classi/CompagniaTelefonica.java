package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class CompagniaTelefonica {
	public CompagniaTelefonica(PianoTariffario[] pianiTariffari) {
		this.pianiTariffari = pianiTariffari;
		this.clienti = new Cliente[0];
	}
	
	public PianoTariffario[] getPianiTariffari() {
		return pianiTariffari;
	}
	public Cliente[] getClienti() {
		return clienti;
	}
	
	public void aggiungiCliente(String nome, String cognome, PianoTariffario pianoTariffario) {
		//crea un nuovo oggetto Cliente con i parametri passati in input
		Cliente nuovoCliente=new Cliente(nome, cognome, pianoTariffario);
		
		//crea un nuovo array di clienti con una lunghezza di uno in più rispetto all'array "clienti" esistente.
		Cliente[] nuovoArrayClienti=new Cliente[clienti.length+1];
		
		//copia ogni elemento dell'array "clienti" esistente all'interno del nuovo array appena creato ("nuovoArrayClienti")
		for (int i = 0; i < clienti.length; i++) {
			nuovoArrayClienti[i]=clienti[i];
		}
		//il nuovo cliente viene aggiunto all'ultimo indice del nuovo array creato
		nuovoArrayClienti[clienti.length]=nuovoCliente;
		//la variabile "clienti" viene aggiornata con il nuovo array
		clienti=nuovoArrayClienti;
	}
	
	private PianoTariffario[] pianiTariffari;
	private Cliente[] clienti;
}
