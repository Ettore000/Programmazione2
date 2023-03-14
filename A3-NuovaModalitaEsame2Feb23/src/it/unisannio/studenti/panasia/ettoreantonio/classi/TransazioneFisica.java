package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class TransazioneFisica extends Transazione {
	public TransazioneFisica(int id, String data, String citta) {
		super(id, data);
		this.citta=citta;
		this.libri=new HashMap<String, Libro>();
	}

	public String getCitta(){return citta;}

	public static TransazioneFisica read(Scanner sc) throws IOException, InputMismatchException{
		int id=0;
		String data="", citta="";
		try {
			System.out.print("ID: ");
			//legge il tipo Int e va a capo
			id=sc.nextInt();sc.nextLine();
			//non può esistere un ID negativo
			if(id<0)return null;

			System.out.print("Data (GGMMAAAA): ");data=sc.nextLine();if(data.equals(""))return null;
			System.out.print("Citta': ");citta=sc.nextLine();if(citta.equals(""))return null;
		} catch (InputMismatchException e) {
			System.err.println("Errore nella registrazione di una transazione fisica");
			//si usa throw perché ferma il programma invece di semplicemente stampare l'errore e continuare
			throw e;
		}
		return new TransazioneFisica(id, data, citta);
	}

	public static TransazioneFisica readFile(Scanner sc){
		if(!sc.hasNextInt())return null;int id=sc.nextInt();
		if(!sc.hasNext())return null;String data=sc.next();
		if(!sc.hasNext())return null;String citta=sc.next();
		return new TransazioneFisica(id, data, citta);
	}

	@Override
	public Map<String, Libro> getLibri(){return libri;}

	@Override
	public void addLibri(Libro libro){libri.put(libro.getTitolo(), libro);}

	@Override
	public double costoTotale() {
		double costoTotale=0;
		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo(); //Ho voluto utilizzare values() perché si tratta di una lista di pochi libri ogni ordine in generale
		return costoTotale;
	}

	@Override
	public void print() {
		System.out.println("'f' "+getId()+" "+getData()+" "+citta);
		for(Libro libro:getLibri().values())System.out.println(libro);
		System.out.println();
	}

	@Override
	public void printFile(PrintStream nomeFile) {
		nomeFile.println("'f' "+getId()+" "+getData()+" "+citta+"\n");
		for(Libro libro:getLibri().values())nomeFile.println(libro);
		nomeFile.println();
	}

	private String citta;
	private Map<String, Libro> libri;
}
