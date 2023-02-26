package it.unisannio.studenti.panasia.ettoreantonio.classi;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Veicolo {
	public Veicolo(String tipo, String marca, String modello, int cilindrata, int numeroRuote) {
		this.tipo = tipo;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.numeroRuote = numeroRuote;
	}

	public String getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}
	public String getModello() {
		return modello;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public int getNumeroRuote() {
		return numeroRuote;
	}

	//Lettura dal File
	public static Veicolo read(Scanner sc) throws InputMismatchException, FileNotFoundException{
		//Dichiarazione e inizializzazione degli identificatori prima del blocco try per essere visibili al metodo
		String tipo="", marca="", modello="";
		int cilindrata=0, numeroRuote=0;
		try {
			/*
			 * La riga viene letta utilizzando il metodo nextLine() di Scanner e
			 * divisa in parti utilizzando il metodo split() di String
			 */
			String riga=sc.nextLine();
			String[] dati = riga.split(",");

			tipo = dati[0];
			marca = dati[1];
			modello = dati[2];
			cilindrata = Integer.parseInt(dati[3]);
			numeroRuote = Integer.parseInt(dati[4]);
		} catch (InputMismatchException e) {
			System.err.println("Errore nella lettura del File");
		}

		return new Veicolo(tipo, marca, modello, cilindrata, numeroRuote);
	}

	//Override del metodo ToString() che stampa in maniera ordinata una stringa dell'istanza
	public String toString() {
		StringBuilder sb=new StringBuilder();

		sb.append("Tipo: "+tipo+"\n");
		sb.append("Marca: "+marca+"\n");
		sb.append("Modello: "+modello+"\n");
		sb.append("Cilindrata: "+cilindrata+"\n");
		sb.append("Numero ruote: "+numeroRuote+"\n");

		return sb.toString();
	}

	private String tipo, marca, modello;
	private int cilindrata, numeroRuote;
}
