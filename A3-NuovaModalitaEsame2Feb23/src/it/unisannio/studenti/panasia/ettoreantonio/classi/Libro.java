package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Libro {
	public Libro(String titolo, String autore, double prezzo) {
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}
	public String getAutore() {
		return autore;
	}
	public double getPrezzo() {
		return prezzo;
	}

	public static Libro read(Scanner sc) throws IOException, InputMismatchException{
		String titolo="", autore="", input="";
		double prezzo=0;
		try {
			System.out.print("Titolo: ");titolo=sc.nextLine();if(titolo.equals(""))return null;
			System.out.print("Autore: ");autore=sc.nextLine();if(autore.equals(""))return null;
			System.out.print("Prezzo: ");input=sc.nextLine();prezzo=Double.parseDouble(input);if(prezzo<0)return null;
		} catch (InputMismatchException e) {
			System.err.println("***Errore nella registrazione di un libro***");
			throw e;
		}
		return new Libro(titolo, autore, prezzo);
	}

	public static Libro readFile(Scanner sc) {
		if(!sc.hasNextLine())return null;String titolo=sc.nextLine();
		if(!sc.hasNextLine())return null;String autore=sc.nextLine();
		if(!sc.hasNextDouble())return null;double prezzo=sc.nextDouble();sc.nextLine();
		return new Libro(titolo, autore, prezzo);
	}

	/*
	 * Viene inserito il metodo toString() anziché print() perché
	 * abbiamo bisogno di una stringa che viene stampata direttamente da
	 * TransazioneFisica e TransazioneOnline, cui metodo attraverso un foreach di un'HashMap
	 * restiruisce la lista di libri compresi da una transazione
	 */
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();

		sb.append(titolo+"\n");
		sb.append(autore+"\n");
		sb.append(prezzo);

		return sb.toString();
	}

	/*
	 * Viene omessa la stampa su File perché viene richiamato il metodo print di Libro
	 * all'interno di TransazioneFisica e TransazioneOnline
	 */

	private String titolo, autore;
	private double prezzo;
}
