package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import it.unisannio.studenti.panasia.ettoreantonio.util.Costante;

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
	
	public static Libro read() throws IOException{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titolo: ");
		String titolo=sc.nextLine();
		if(titolo.equals(""))return null;
		
		System.out.println("Autore: ");
		String autore=sc.nextLine();
		if(autore.equals(""))return null;
		
		System.out.println("Prezzo: ");
		double prezzo=sc.nextDouble();sc.nextLine();
		if(prezzo<0)return null;
		
		return new Libro(titolo, autore, prezzo);
	}
	
	public static Libro read(String nomeFile) throws FileNotFoundException {
		File file = new File(nomeFile);
		Scanner sc = new Scanner(file);
		
		if(!sc.hasNextLine())return null;
		String titolo=sc.nextLine();
		
		if(!sc.hasNextLine())return null;
		String autore=sc.nextLine();
		
		if(!sc.hasNextDouble())return null;
		double prezzo=sc.nextDouble();
		
		return new Libro(titolo, autore, prezzo);
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append(titolo+"\n");
		sb.append(autore+"\n");
		sb.append(prezzo);
		
		return sb.toString();
	}
	
	private String titolo, autore;
	private double prezzo;
}
