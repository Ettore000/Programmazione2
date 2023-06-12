package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Canzone: modella una canzone
 */
public class Canzone {
	/**
	 * Crea una canzone specificando il titolo e l'artista
	 * @param titolo
	 * @param artista
	 */
	public Canzone(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}

	/**
	 * Ottiene il titolo
	 * @return titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Ottiene l'artista
	 * @return artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * Legge l'oggetto da tastiera
	 * @return Canzone(titolo, artista)
	 */
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

	/**
	 * Legge l'oggetto da file
	 * @param sc
	 * @return Canzone(titolo, artista)
	 */
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

	/**
	 * Riassume una canzone
	 * @return titolo e artista
	 */
	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", artista=" + artista + "]";
	}
	
	/**
	 * Visualizza a schermo una canzone
	 */
	public void print() {
		System.out.println("Titolo: "+titolo);
		System.out.println("Artista: "+artista);
	}

	/**
	 * Scrive su file
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(titolo+" - "+artista+"\n");
	}

	private String titolo, artista;
}
