package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TransazioneFisica extends Transazione {
	public TransazioneFisica(int id, String data, String citta) {
		super(id, data);
		this.citta = citta;
	}

	public String getCitta() {
		return citta;
	}

	public static TransazioneFisica read(Scanner sc) throws IOException, InputMismatchException{
		int id=0;
		String data="", citta="";
		try {
			System.out.println("ID: ");
			//legge il tipo Int e va a capo
			id=sc.nextInt();sc.nextLine();
			//non può esistere un prezzo negativo
			if(id<0)return null;
			
			System.out.println("Data (GGMMAAAA): ");
			data=sc.nextLine();
			if(data.equals(""))return null;
			
			System.out.println("Citta': ");
			citta=sc.nextLine();
			if(citta.equals(""))return null;
		} catch (InputMismatchException e) {
			System.err.println("Errore nella registrazione di una transazione");
			//si usa throw perché ferma il programma invece di semplicemente stampare l'errore e continuare
			throw e;
		}

		return new TransazioneFisica(id, data, citta);
	}

	private String citta;
}
