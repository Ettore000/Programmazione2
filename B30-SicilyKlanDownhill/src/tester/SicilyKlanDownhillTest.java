package tester;

import classi.SicilyKlanDownhill;

public class SicilyKlanDownhillTest {

	public static void main(String[] args) {
		SicilyKlanDownhill skd=new SicilyKlanDownhill(8);

		skd.aggiungiPersona("Daniele", 1);
		skd.aggiungiPersona("Giovanni", 2);
		skd.aggiungiPersona("Peppe", 3);
		skd.aggiungiPersona("Davide", 4);
		skd.aggiungiPersona("Salvatore", 5);
		skd.aggiungiPersona("Simone", 6);
		skd.aggiungiPersona("Arthem", 7);
		skd.aggiungiPersona("Stefano", 8);

		while (skd.getGiriFatti() < SicilyKlanDownhill.getNumGiri()) {
			if (skd.furgonePieno()) {
				skd.stampaSituazione();
				skd.avanti();
			} else {
				int indexPersona = skd.getNumPersone() - skd.getGiriFatti() % skd.getNumPersone() - 1;
				String persona = skd.getPersona(indexPersona);
				int bicicletta = skd.getBicicletta(indexPersona);
				System.out.println(persona + " si e' unito al gruppo con la bicicletta " + bicicletta);
				skd.aggiungiPersona(persona, bicicletta);
			}
			skd.gira();
		}

		skd.stampaSituazione();
		System.out.println("Incasso totale: " + skd.calcolaIncasso() + " euro");
		System.out.println("Costo della benzina: " + skd.calcolaCostoBenzina() + " euro");
	}

}
