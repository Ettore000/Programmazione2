package classi;

import java.io.PrintStream;
import java.util.Scanner;

public class OperaMultimediale {
	public OperaMultimediale(String autore, String titolo, String supporto, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.supporto = supporto;
		this.anno = anno;
		this.collocazione = collocazione;
	}

	public String getAutore() {
		return autore;
	}
	public String getTitolo() {
		return titolo;
	}
	public String getSupporto() {
		return supporto;
	}
	public String getCollocazione() {
		return collocazione;
	}
	public int getAnno() {
		return anno;
	}

	public static OperaMultimediale read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", supporto="", collocazione="";
		int anno=0;
		try {
			System.out.println("Autore: ");
			autore=sc.nextLine();
			if(autore.equals(""))return null;

			System.out.println("Titolo: ");
			titolo=sc.nextLine();
			if(titolo.equals(""))return null;

			System.out.println("Supporto: ");
			supporto=sc.nextLine();
			if(supporto.equals(""))return null;

			System.out.println("Anno: ");
			anno=sc.nextInt();sc.nextLine();
			if(anno==0)return null;

			System.out.println("Collocazione: ");
			collocazione=sc.nextLine();
			if(collocazione.equals(""))return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da tastiera non sono conformi");
		}
		return new OperaMultimediale(autore, titolo, supporto, anno, collocazione);
	}

	public static OperaMultimediale read(Scanner sc) {
		String autore="", titolo="", supporto="", collocazione="";
		int anno=0;
		try {
			autore=sc.next();
			if(sc.hasNext())return null;

			titolo=sc.next();
			if(sc.hasNext())return null;

			supporto=sc.next();
			if(sc.hasNext())return null;

			anno=sc.nextInt();sc.next();
			if(sc.hasNext())return null;

			collocazione=sc.next();
			if(sc.hasNext())return null;
		} catch (NullPointerException e) {
			System.err.println("I dati letti da file non sono conformi");
		}
		return new OperaMultimediale(autore, titolo, supporto, anno, collocazione);
	}

	@Override
	public String toString() {
		return "OperaMultimediale [autore=" + autore + ", titolo=" + titolo + ", tecnica=" + supporto + ", anno=" + anno
				+ ", collocazione=" + collocazione + "]";
	}

	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+supporto+"//"+collocazione+"\n");
	}

	private String autore, titolo, supporto, collocazione;
	private int anno;
}
