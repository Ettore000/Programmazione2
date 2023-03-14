package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class TransazioneOnline extends Transazione {
	public TransazioneOnline(int id, String data, String ip) {
		super(id, data);
		this.ip=ip;
		this.libri=new HashMap<String, Libro>();
	}

	public String getIp(){return ip;}

	public static TransazioneOnline read(Scanner sc) throws IOException, InputMismatchException{
		int id=0;
		String data="", ip="";
		try {
			System.out.print("ID: ");id=sc.nextInt();sc.nextLine();if(id<0)return null;
			System.out.print("Data (GGMMAAAA): ");data=sc.nextLine();if(data.equals(""))return null;
			System.out.print("IP (xxx.xxx.xxx.xxx): ");ip=sc.nextLine();if(ip.equals(""))return null;
		} catch (InputMismatchException e) {
			System.err.println("Errore nella registrazione di una transazione online");
			throw e;
		}
		return new TransazioneOnline(id, data, ip);
	}

	public static TransazioneOnline readFile(Scanner sc){
		if(!sc.hasNextInt())return null;int id=sc.nextInt();
		if(!sc.hasNext())return null;String data=sc.next();
		if(!sc.hasNext())return null;String ip=sc.next();
		return new TransazioneOnline(id, data, ip);
	}

	@Override
	public Map<String, Libro> getLibri(){return libri;}

	@Override
	public void addLibri(Libro libro){libri.put(libro.getTitolo(), libro);}

	@Override
	public double costoTotale() {
		double costoTotale=0;

		for(Libro libro: libri.values())costoTotale+=libro.getPrezzo();

		return costoTotale;
	}

	@Override
	public void print() {
		System.out.println("'o' "+getId()+" "+getData()+" "+ip);
		for(Libro libro:getLibri().values())System.out.println(libro);
		System.out.println();
	}

	@Override
	public void printFile(PrintStream nomeFile) {
		nomeFile.println("'o' "+getId()+" "+getData()+" "+ip+"\n");
		for(Libro libro:getLibri().values())nomeFile.println(libro);
		nomeFile.println();
	}

	private String ip;
	private Map<String, Libro> libri;
}
