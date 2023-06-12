package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Nome: modella un nome completo e il titolo attribuibile a esso a seconda dello stato sociale
 */
public class Nome {
	/**
	 * Crea un'stanza dell'oggetto specificando titolo sociale, cognome e nome
	 * @param titolo
	 * @param cognome
	 * @param nome
	 */
	public Nome(String titolo, String cognome, String nome) {
		this.titolo = titolo;
		this.cognome = cognome;
		this.nome = nome;
	}

	/**
	 * Ottiene il titolo sociale
	 * @return titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Modifica il titolo sociale
	 * @param titolo
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Ottiene il nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ottiene il cognome
	 * @return cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Ottiene le iniziali del nome e del cognome
	 * @return iniziali
	 */
	public String getIiniziali() {
		char inizialiNome=nome.charAt(0);
		char inizialiCognome=cognome.charAt(0);

		String iniziali=String.valueOf(inizialiNome) + String.valueOf(inizialiCognome);

		return iniziali;
	}

	/**
	 * legge l'oggetto da tastiera
	 * @return Nome(titolo, cognome, nome)
	 */
	public static Nome read() {
		String titolo="", cognome="", nome="";

		Scanner sc=new Scanner(System.in);

		System.out.print("Titolo: ");
		titolo=sc.nextLine();
		if(titolo.equals(""))return null;

		System.out.print("Cognome: ");
		cognome=sc.nextLine();
		if(cognome.equals(""))return null;

		System.out.print("Nome: ");
		nome=sc.nextLine();
		if(nome.equals(""))return null;

		return new Nome(titolo, cognome, nome);
	}

	/**
	 * legge l'oggetto da file
	 * @param sc
	 * @return Nome(titolo, cognome, nome)
	 */
	public static Nome read(Scanner sc) {
		String titolo="", cognome="", nome="";

		if(!sc.hasNext())return null; //controllo di fine input
		titolo=sc.next();
		
		if(!sc.hasNext())return null;
		cognome=sc.next();

		if(!sc.hasNext())return null;
		nome=sc.next();

		return new Nome(titolo, cognome, nome);
	}

	/**
	 * Riassunto dell'istanza dell'oggetto
	 * @return stringa con titolo, cognome e nome
	 */
	@Override
	public String toString() {
		return "Nome [titolo=" + titolo + ", cognome=" + cognome + ", nome=" + nome + "]";
	}

	/**
	 * Stampa l'istanza su schermo
	 */
	public void print() {
		System.out.println("Titolo: "+titolo);
		System.out.println("Cognome: "+nome);
		System.out.println("Nome: "+cognome);
	}

	/**
	 * Scrive l'istanza su file
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(titolo+" "+cognome+" "+nome+"\n");
	}

	private String titolo, cognome, nome;
}
