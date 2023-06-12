package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Stampa: modella una stampa
 */
public class Stampa {
	/**
	 * Crea un stampa
	 * @param autore
	 * @param titolo
	 * @param tecnica
	 * @param anno
	 * @param collocazione
	 */
	public Stampa(String autore, String titolo, String tecnica, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.tecnica = tecnica;
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
	 * Ottiene informazioni sulla tecnica utilizzata
	 * @return tecnica
	 */
	public String getTecnica() {
		return tecnica;
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
	 * Legge una stampa da tastiera
	 * @return Stampa(autore, titolo, tecnica, anno, collocazione)
	 */
	public static Stampa read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", tecnica="", collocazione="";
		int anno=0;

		System.out.println("Autore: ");
		autore=sc.nextLine();
		if(autore.equals(""))return null;

		System.out.println("Titolo: ");
		titolo=sc.nextLine();
		if(titolo.equals(""))return null;

		System.out.println("Tecnica: ");
		tecnica=sc.nextLine();
		if(tecnica.equals(""))return null;

		System.out.println("Anno: ");
		anno=sc.nextInt();sc.nextLine();
		if(anno==0)return null;

		System.out.println("Collocazione: ");
		collocazione=sc.nextLine();
		if(collocazione.equals(""))return null;

		return new Stampa(autore, titolo, tecnica, anno, collocazione);
	}

	/**
	 * Legge una stampa da file
	 * @param sc
	 * @return Stampa(autore, titolo, tecnica, anno, collocazione)
	 */
	public static Stampa read(Scanner sc) {
		String autore="", titolo="", tecnica="", collocazione="";
		int anno=0;

		autore=sc.next();
		if(sc.hasNext())return null;

		titolo=sc.next();
		if(sc.hasNext())return null;

		tecnica=sc.next();
		if(sc.hasNext())return null;

		anno=sc.nextInt();sc.next();
		if(sc.hasNext())return null;

		collocazione=sc.next();
		if(sc.hasNext())return null;

		return new Stampa(autore, titolo, tecnica, anno, collocazione);
	}

	/**
	 * Riassume una stampa
	 */
	@Override
	public String toString() {
		return "Stampa [autore=" + autore + ", titolo=" + titolo + ", tecnica=" + tecnica + ", anno=" + anno
				+ ", collocazione=" + collocazione + "]";
	}

	/**
	 * Visualizza una stampa
	 */
	public void print() {
		System.out.println("Autore: "+autore);
		System.out.println("Titolo: "+titolo);
		System.out.println("Tecnica"+tecnica);
		System.out.println("Anno"+anno);
		System.out.println("Collocazione"+collocazione);
	}
	
	/**
	 * Scrive una stampa su file
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+tecnica+"//"+collocazione+"\n");
	}

	private String autore, titolo, tecnica, collocazione;
	private int anno;
}
