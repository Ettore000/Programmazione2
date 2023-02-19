package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
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
	
	public static Transazione read() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipo ('f' o 'o'): ");
		char tipo=sc.next().charAt(0);sc.nextLine();
		if(tipo=='\0') {
			return null;
		} else if(tipo!='f' && tipo!='o') {
			return null;
		}
		
		System.out.println("ID: ");
		int id=sc.nextInt();sc.nextLine();
		if(id<0)return null;
		
		System.out.println("Data: ");
		String data=sc.nextLine();
		if(data.equals(""))return null;
		
		String citta="", ip="";
		if(tipo=='f') {
			System.out.println("Citta': ");
			citta=sc.nextLine();
			if(data.equals(""))return null;
		} else {
			System.out.println("IP: ");
			ip=sc.nextLine();
			if(data.equals(""))return null;
		}
		
		return new Transazione(tipo, id, data, citta, ip);
	}
	
	public static Transazione read(String nomeFile) throws FileNotFoundException{
		File file = new File(nomeFile);
		Scanner sc = new Scanner(file);
		
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