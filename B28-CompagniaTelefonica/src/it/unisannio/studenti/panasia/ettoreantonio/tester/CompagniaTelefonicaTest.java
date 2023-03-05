package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Cliente;
import it.unisannio.studenti.panasia.ettoreantonio.classi.CompagniaTelefonica;
import it.unisannio.studenti.panasia.ettoreantonio.classi.PianoTariffario;

public class CompagniaTelefonicaTest {

	public static void main(String[] args) {
		PianoTariffario base=new PianoTariffario("Base", 10, 100, 50, 2);
		PianoTariffario premium = new PianoTariffario("Premium", 20, 300, 100, 10);
		PianoTariffario plus = new PianoTariffario("Plus", 30, 600, 200, 20);
		
		PianoTariffario[] pianiTariffari= {base, premium, plus};
		CompagniaTelefonica compagniaTelefonica=new CompagniaTelefonica(pianiTariffari);
		
		compagniaTelefonica.aggiungiCliente("Mario", "Rossi", premium);
		compagniaTelefonica.aggiungiCliente("Luigi", "Verdi", base);
		
		Cliente[] clienti=compagniaTelefonica.getClienti();
		
		for (int i = 0; i < clienti.length; i++) {
			System.out.println(clienti[i].getNome()+" "+clienti[i].getCognome()+" ha un piano tariffario "+clienti[i].getPianoTariffario().getNome());
		    double costoMensile = clienti[i].calcolaCostoMensile(200, 100, 5);
		    System.out.println("Il costo mensile per " + clienti[i].getNome() + " " + clienti[i].getCognome() + " e' di " + costoMensile + " euro.");
		}
	}

}
