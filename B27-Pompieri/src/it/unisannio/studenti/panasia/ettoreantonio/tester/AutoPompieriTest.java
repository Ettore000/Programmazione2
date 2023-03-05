package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.AutoPompieri;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Pompiere;

public class AutoPompieriTest {

	public static void main(String[] args) {
		//Crea due pompieri
		Pompiere p1 = new Pompiere("Mario", "Rossi", 30, 5);
		Pompiere p2 = new Pompiere("Luigi", "Verdi", 25, 3);
		
		//crea un'auto dei pompieri e aggiunge i pompieri all'equipaggio
		AutoPompieri auto=new AutoPompieri("Fiat", "Punto", 100, new Pompiere[2]);
		
		auto.aggiungiPompiere(p1);
		auto.aggiungiPompiere(p2);
		
		//accende il motore e la pompa e spruzza acqua per 5 secondi
		auto.accendiMotore();
		auto.accendiPompa();
		auto.spruzzaAcqua(5);
		
		//rimuove il secondo pompiere dall'equipaggio
		auto.rimuoviPompiere(p2);
	}

}
