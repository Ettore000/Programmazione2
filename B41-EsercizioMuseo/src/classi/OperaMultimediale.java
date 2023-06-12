package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * OperaMultimediale: modella un'opera multimediale
 */
public class OperaMultimediale {
	/**
	 * Crea un'opera multimediale specificando autore, titolo, supporto, anno, collocazione
	 * @param autore
	 * @param titolo
	 * @param supporto
	 * @param anno
	 * @param collocazione
	 */
	public OperaMultimediale(String autore, String titolo, String supporto, int anno, String collocazione) {
		this.autore = autore;
		this.titolo = titolo;
		this.supporto = supporto;
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
	 * Ottiene informazioni sul tipo di supporto utilizzato
	 * @return supporto
	 */
	public String getSupporto() {
		return supporto;
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
	 * Legge un'opera multimediale da tastiera
	 * @return OperaMultimediale(autore, titolo, supporto, anno, collocazione)
	 */
	public static OperaMultimediale read() {
		Scanner sc=new Scanner(System.in);

		String autore="", titolo="", supporto="", collocazione="";
		int anno=0;

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

		return new OperaMultimediale(autore, titolo, supporto, anno, collocazione);
	}

	/**
	 * Legge un'opera multimediale da file
	 * @param sc
	 * @return OperaMultimediale(autore, titolo, supporto, anno, collocazione)
	 */
	public static OperaMultimediale read(Scanner sc) {
		String autore="", titolo="", supporto="", collocazione="";
		int anno=0;

		if(!sc.hasNext())return null;
		autore=sc.next();

		if(!sc.hasNext())return null;
		titolo=sc.next();

		if(!sc.hasNext())return null;
		supporto=sc.next();

		if(!sc.hasNext())return null;
		anno=sc.nextInt();

		if(!sc.hasNext())return null;
		collocazione=sc.next();

		return new OperaMultimediale(autore, titolo, supporto, anno, collocazione);
	}

	/**
	 * Riassume un'opera multimediale
	 * @return stringa con autore, titolo, tenica, anno, collocazione
	 */
	@Override
	public String toString() {
		return "OperaMultimediale [autore=" + autore + ", titolo=" + titolo + ", supporto=" + supporto + ", anno=" + anno
				+ ", collocazione=" + collocazione + "]";
	}
	
	/**
	 * Visualizza un'opera multimediale
	 */
	public void print() {
		System.out.println("Autore: "+autore);
		System.out.println("Titolo: "+titolo);
		System.out.println("Supporto: "+supporto);
		System.out.println("Anno: "+anno);
		System.out.println("Collocazione"+collocazione);
	}

	/**
	 * Scrive su file un'opera multimediale
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(autore+"//"+titolo+"//"+anno+"//"+supporto+"//"+collocazione+"\n");
	}

	private String autore, titolo, supporto, collocazione;
	private int anno;
}
