package classi;

import java.io.PrintStream;
import java.util.Scanner;

public class Canzone {
	public Canzone(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getArtista() {
		return artista;
	}

	public static Canzone read() {
		Scanner sc=new Scanner(System.in);

		String titolo="", artista="";

		try {
			System.out.println("Titolo: ");
			titolo=sc.nextLine();
			if(titolo.equals(""))return null;

			System.out.println("Artista: ");
			artista=sc.nextLine();
			if(artista.equals(""))return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da tastiera non sono conformi");
		}

		return new Canzone(titolo, artista);
	}

	public static Canzone read(Scanner sc) {
		String titolo="", artista="";

		try {
			titolo=sc.next();
			if(!sc.hasNext())return null;

			artista=sc.next();
			if(!sc.hasNext())return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da file non sono conformi");
		}

		return new Canzone(titolo, artista);
	}

	//stampa su display
	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", artista=" + artista + "]";
	}

	//scrivi su file
	public void print(PrintStream ps) {
		ps.print(titolo+" - "+artista+"\n");
	}

	private String titolo, artista;
}
