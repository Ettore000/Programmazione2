package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Libro: modella un libro
 */
public class Libro {
	/**
	 * Crea un libro specificando autore, titolo, anno di pubblicazione e collocazione all'interno del museo
	 * @param autore
	 * @param titolo
	 * @param anno
	 * @param collocazione
	 */
	public Libro(String autore, String titolo, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.anno = anno;
		this.collocazione = collocazione;
	}

	/**
	 * Ottiene il nome dell'autore
	 * @return autore
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * Ottiene il titolo del libro
	 * @return titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Ottiene la collocazione all'interno del museo
	 * @return collocazione
	 */
	public String getCollocazione() {
		return collocazione;
	}

	/**
	 * Ottiene l'anno di pubblicazione
	 * @return anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * Legge un libro da tastiera
	 * @return Libro(autore, titolo, anno, collocazione)
	 */
	public static Libro read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", collocazione="";
		int anno=0;

		System.out.print("Autore: ");
		autore=sc.nextLine();
		if(autore.equals(""))return null;

		System.out.print("Titolo: ");
		titolo=sc.nextLine();
		if(titolo.equals(""))return null;

		System.out.print("Anno: ");
		anno=sc.nextInt();sc.nextLine();
		if(anno==0)return null;

		System.out.print("Collocazione: ");
		collocazione=sc.nextLine();
		if(collocazione.equals(""))return null;

		return new Libro(autore, titolo, anno, collocazione);
	}

	/**
	 * Legge un libro da file
	 * @param sc
	 * @return Libro(autore, titolo, anno, collocazione)
	 */
	public static Libro read(Scanner sc) {
		String autore="", titolo="", collocazione="";
		int anno=0;

		if(sc.hasNext())return null;
		autore=sc.next();

		if(sc.hasNext())return null;
		titolo=sc.next();

		if(sc.hasNext())return null;
		anno=sc.nextInt();

		if(sc.hasNext())return null;
		collocazione=sc.next();

		return new Libro(autore, titolo, anno, collocazione);
	}

	/**
	 * Riassume un libro
	 * @return stringa con autore, titolo, anno, collocazione
	 */
	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + ", anno=" + anno + ", collocazione=" + collocazione
				+ "]";
	}

	/**
	 * Visualizza un libro
	 */
	public void print() {
		System.out.println("Autore: "+autore);
		System.out.println("Titolo: "+titolo);
		System.out.println("Anno: "+anno);
		System.out.println("Collocazione: "+collocazione);
	}

	/**
	 * Scrive su file un libro
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+collocazione+"\n");
	}

	private String autore, titolo, collocazione;
	private int anno;
}
