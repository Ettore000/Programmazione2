package classi;

import java.io.PrintStream;
import java.util.Scanner;

public class Libro {
	public Libro(String autore, String titolo, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.anno = anno;
		this.collocazione = collocazione;
	}

	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getCollocazione() {
		return collocazione;
	}
	public int getAnno() {
		return anno;
	}

	public static Libro read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", collocazione="";
		int anno=0;
		try {
			System.out.println("Autore: ");
			autore=sc.nextLine();
			if(autore.equals(""))return null;

			System.out.println("Titolo: ");
			titolo=sc.nextLine();
			if(titolo.equals(""))return null;

			System.out.println("Anno: ");
			anno=sc.nextInt();sc.nextLine();
			if(anno==0)return null;

			System.out.println("Collocazione: ");
			collocazione=sc.nextLine();
			if(collocazione.equals(""))return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da tastiera non sono conformi");
		}
		return new Libro(autore, titolo, anno, collocazione);
	}

	public static Libro read(Scanner sc) {
		String autore="", titolo="", collocazione="";
		int anno=0;
		try {
			autore=sc.next();
			if(sc.hasNext())return null;

			titolo=sc.next();
			if(sc.hasNext())return null;

			anno=sc.nextInt();sc.next();
			if(sc.hasNext())return null;

			collocazione=sc.next();
			if(sc.hasNext())return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da file non sono conformi");
		}
		return new Libro(autore, titolo, anno, collocazione);
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + ", anno=" + anno + ", collocazione=" + collocazione
				+ "]";
	}

	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+collocazione+"\n");
	}

	private String autore, titolo, collocazione;
	private int anno;
}
