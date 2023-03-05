package classi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SicilyKlanDownhill {
	public SicilyKlanDownhill(int numPersone) {
        this.numPersone = numPersone;
        persone = new ArrayList<String>(numPersone);
        biciclette = new ArrayList<Integer>(numPersone);
        autistaCorrente = 0;
        giriFatti = 0;
    }
	
	public static int getNumPostiFurgone() {
		return NUM_POSTI_FURGONE;
	}
	public static int getNumGiri() {
		return NUM_GIRI;
	}
	public static int getPrezzoBiglietto() {
		return PREZZO_BIGLIETTO;
	}
	public int getNumPersone() {
		return numPersone;
	}
	public int getAutistaCorrente() {
		return autistaCorrente;
	}
	public int getGiriFatti() {
		return giriFatti;
	}
	public List<String> getPersone() {
		return persone;
	}
	public List<Integer> getBiciclette() {
		return biciclette;
	}
	
	public void aggiungiPersona(String persona, int bicicletta) {
		if (persone.size() < numPersone) {
            persone.add(persona);
            biciclette.add(bicicletta);
        }
	}
	
	public boolean furgonePieno() {
        return persone.size() == NUM_POSTI_FURGONE;
    }

    public void avanti() {
        autistaCorrente = (autistaCorrente + 1) % NUM_POSTI_FURGONE;
    }
    
    public void gira() {
        Random rand = new Random();
        int sceltaPercorso = rand.nextInt(7) + 1; // scegli un numero casuale tra 1 e 7
        System.out.println("Il percorso scelto e' il numero " + sceltaPercorso);
        int indexBicicletta = giriFatti % NUM_POSTI_FURGONE;
        int bicicletta = biciclette.get(indexBicicletta);
        boolean foratura = rand.nextBoolean(); // scegli casualmente se c'è una foratura o no
        if (foratura) {
            System.out.println("Una bicicletta ha forato la gomma!");
            riparaGomma(bicicletta);
        } else {
            System.out.println("Le biciclette hanno completato il giro senza problemi.");
        }
        giriFatti++;
    }
    
    public void riparaGomma(int bicicletta) {
        System.out.println("Riparazione della bicicletta " + bicicletta);
    }
    
    public void stampaSituazione() {
        System.out.println("Situazione attuale:");
        System.out.println("Persone nel furgone:");
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i) + " con la bicicletta " + biciclette.get(i));
        }
        System.out.println("Autista corrente: " + getAutistaCorrente());
        System.out.println("Giri fatti: "+ giriFatti+"\n");
    }
    
    public int calcolaIncasso() {
        return numPersone * PREZZO_BIGLIETTO;
    }
    
    public int calcolaCostoBenzina() {
        return COSTO_BENZINA;
    }
    
    public String getPersona(int index) {
        return persone.get(index);
    }

    public int getBicicletta(int index) {
        return biciclette.get(index);
    }
	
	private static final int NUM_POSTI_FURGONE = 8;
    private static final int NUM_GIRI = 10;
    private static final int PREZZO_BIGLIETTO = 10;
    private static final int COSTO_BENZINA = 30;
    
    private int numPersone, autistaCorrente, giriFatti;
    private List<String> persone;
    private List<Integer> biciclette;
}
