package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Transazione {
	public Transazione(char tipo, int id, String data, String citta, String ip) {
		this.tipo = tipo;
		this.id = id;
		this.data = data;
		this.citta = citta;
		this.ip = ip;
		this.libri = new HashMap<String, Libro>();
	}
	
	public char getTipo() {
		return tipo;
	}
	public int getId() {
		return id;
	}
	public String getData() {
		return data;
	}
	public String getCitta() {
		return citta;
	}
	public String getIp() {
		return ip;
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
		String data="", citta="", ip="";
		char tipo='\0';
		try {
			System.out.println("Tipo ('f' o 'o'): ");
			//si utilizza charAt(0) per leggere solo il primo carattere dopo il puntatore dello Scanner
			//dopodiché si va a capo
			tipo=sc.next().charAt(0);sc.nextLine();
			//si verifica la validità di tipo se non è nulla o ha valori diversi da 'f' e 'o'
			if(tipo=='\0' || (tipo!='f' && tipo!='o')) {
				return null;
			}

			System.out.println("ID: ");
			//legge il tipo Int e va a capo
			id=sc.nextInt();sc.nextLine();
			//non può esistere un prezzo negativo
			if(id<0)return null;

			System.out.println("Data (GGMMAAAA): ");
			data=sc.nextLine();
			if(data.equals(""))return null;

			if(tipo=='f') {
				System.out.println("Citta': ");
				citta=sc.nextLine();
				if(citta.equals(""))return null;
			} else {
				System.out.println("IP (xxx.xxx.xxx.xxx): ");
				ip=sc.nextLine();
				if(ip.equals(""))return null;
			}
		} catch (InputMismatchException e) {
			//si avverte che qualcosa non è valido
			System.err.println("Errore nella registrazione di una transazione");
			//si usa throw perché ferma il programma invece di semplicemente stampare l'errore e continuare
			throw e;
		}
		return new Transazione(tipo, id, data, citta, ip);
	}

	public static Transazione readFile(Scanner sc){
		if(!sc.hasNext())return null;
		char tipo=sc.next().charAt(0);

		if(!sc.hasNextInt())return null;
		int id=sc.nextInt();

		if(!sc.hasNext())return null;
		String data=sc.next();


		String citta="", ip="";
		if(tipo=='f') {
			if(!sc.hasNext())return null;
			citta=sc.next();
		} else {
			if(!sc.hasNext())return null;
			ip=sc.next();
		}

		return new Transazione(tipo, id, data, citta, ip);
	}

	public double costoTotale() {
		double costoTotale=0;

		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo();

		return costoTotale;
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();

		sb.append(tipo+" "+id+" "+data+" "+citta+ip+"\n");
		for(Libro libro:libri.values())sb.append(libro.toString());
		sb.append("\n");

		return sb.toString();
	}

	public void print(PrintStream nomeFile) {
		nomeFile.println("'"+tipo+"' "+id+" "+data+" "+citta+ip+"\n");
		for(Libro libro:libri.values())nomeFile.println(libro.toString());
		nomeFile.println("\n");
	}

	private int id;
	private String data, citta, ip;
	private char tipo;
	private Map<String, Libro> libri;
}