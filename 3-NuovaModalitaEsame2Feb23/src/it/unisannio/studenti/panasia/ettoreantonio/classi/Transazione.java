package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Transazione {
	public Transazione(int id, String data) {
		this.id = id;
		this.data = data;
		this.libri = new HashMap<String, Libro>();
	}
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public Map<String, Libro> getLibri() {
		return libri;
	}
	
	public void addLibri(String chiave, Libro libro) {
		libri.put(chiave, libro);
	}
	public static Transazione read(Scanner sc) throws IOException, InputMismatchException{
		//si inizializzano tutti gli identificatori prima del blocco try
		int id=0;
		String data="";
		try {
			System.out.println("ID: ");
			//legge il tipo Int e va a capo
			id=sc.nextInt();sc.nextLine();
			//non può esistere un prezzo negativo
			if(id<0)return null;

			System.out.println("Data (GGMMAAAA): ");
			data=sc.nextLine();
			if(data.equals(""))return null;
		} catch (InputMismatchException e) {
			//si avverte che qualcosa non è valido
			System.err.println("Errore nella registrazione di una transazione");
			//si usa throw perché ferma il programma invece di semplicemente stampare l'errore e continuare
			throw e;
		}
		return new Transazione(id, data);
	}

	public static Transazione readFile(Scanner sc){
		if(!sc.hasNextInt())return null;
		int id=sc.nextInt();

		if(!sc.hasNext())return null;
		String data=sc.next();
		
		return new Transazione(id, data);
	}

	public double costoTotale() {
		double costoTotale=0;

		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo();

		return costoTotale;
	}

	//TODO come organizzare questo?
	/*public String toString() {
		StringBuilder sb=new StringBuilder();

		sb.append(tipo+" "+id+" "+data+" "+citta+ip+"\n");
		for(Libro libro:libri.values())sb.append(libro.toString());
		sb.append("\n");

		return sb.toString();
	}*/
	
	//TODO come organizzare questo?
	/*public void print(PrintStream nomeFile) {
		nomeFile.println("'"+tipo+"' "+id+" "+data+" "+citta+ip+"\n");
		for(Libro libro:libri.values())nomeFile.println(libro.toString());
		nomeFile.println("\n");
	}*/

	private int id;
	private String data;
	private Map<String, Libro> libri;
}