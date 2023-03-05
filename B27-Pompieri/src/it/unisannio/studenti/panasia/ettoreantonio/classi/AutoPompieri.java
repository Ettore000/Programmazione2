package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class AutoPompieri {
	public AutoPompieri(String marca, String modello, double serbatoio, Pompiere[] pompieri) {
		this.marca = marca;
		this.modello = modello;
		this.serbatoio = serbatoio;
		this.motoreAcceso = false;
		this.pompaAccesa = false;
		this.pompieri = pompieri;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public double getSerbatoio() {
		return serbatoio;
	}
	public boolean isMotoreAcceso() {
		return motoreAcceso;
	}
	public boolean isPompaAccesa() {
		return pompaAccesa;
	}
	public Pompiere[] getPompieri() {
		return pompieri;
	}
	
	public void accendiMotore() {
		motoreAcceso=true;
	}
	
	public void spegniMotore() {
		motoreAcceso=false;
	}
	
	public void accendiPompa() {
	    pompaAccesa=true;
	}

	public void spegniPompa() {
	    pompaAccesa=false;
	}
	
	public void spruzzaAcqua(int durata) {
		if(pompaAccesa && motoreAcceso && serbatoio>0) {
			int portata=10; //quantità di acqua spruzzata al secondo
			int quantita=portata*durata;
			
			if(serbatoio>=quantita) {
				serbatoio-=quantita;
				System.out.println(quantita+" litri d'acqua spruzzata in "+durata+" secondi");
			} else {
				System.err.println("Serbatoio vuoto!");
			}
		} else {
			System.err.println("Motore o pompa non accesi!");
		}
	}
	
	public void aggiungiPompiere(Pompiere pompiere) {
		//Controllo se c'è spazio nell'equipaggio
		boolean trovato=false;
		for (int i = 0; i < pompieri.length; i++) {
			if(pompieri[i]==null) {
				
			}
		}
	}
	
	private String marca, modello;
	private double serbatoio;
	private boolean motoreAcceso, pompaAccesa;
	private Pompiere[] pompieri;
}
