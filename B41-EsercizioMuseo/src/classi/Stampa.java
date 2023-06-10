package classi;

import java.io.PrintStream;
import java.util.Scanner;

public class Stampa {
	public Stampa(String autore, String titolo, String tecnica, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.tecnica = tecnica;
		this.anno = anno;
		this.collocazione = collocazione;
	}

	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getTecnica() {
		return tecnica;
	}
	public String getCollocazione() {
		return collocazione;
	}
	public int getAnno() {
		return anno;
	}

	public static Stampa read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", tecnica="", collocazione="";
		int anno=0;
		try {
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
		} catch (NullPointerException e) {
			System.err.println("I dati letti da tastiera non sono conformi");
		}
		return new Stampa(autore, titolo, tecnica, anno, collocazione);
	}

	public static Stampa read(Scanner sc) {
		String autore="", titolo="", tecnica="", collocazione="";
		int anno=0;
		try {
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
		} catch (NullPointerException e) {
			System.err.println("I dati letti da file non sono conformi");
		}
		return new Stampa(autore, titolo, tecnica, anno, collocazione);
	}

	@Override
	public String toString() {
		return "Stampa [autore=" + autore + ", titolo=" + titolo + ", tecnica=" + tecnica + ", anno=" + anno
				+ ", collocazione=" + collocazione + "]";
	}

	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+tecnica+"//"+collocazione+"\n");
	}
	
	private String autore, titolo, tecnica, collocazione;
	private int anno;
}
