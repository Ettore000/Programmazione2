package classi;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Costante;

/**
 * Modella studenti e i loro rispettivi esami
 */
public class Studente implements Comparable<Studente>{
	/**
	 * Crea uno studente
	 * @param nome
	 * @param cognome
	 * @param matricola
	 */
	public Studente(String nome, String cognome, int matricola) {
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
		this.esami=new ArrayList<Esame>();
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
	 * Ottiene la matricola
	 * @return matricola
	 */
	public int getMatricola() {
		return matricola;
	}
	
	/**
	 * Ottiene una lista di esami svolti dallo studente
	 * @return esami
	 */
	public List<Esame> getEsami() {
		return esami;
	}
	
	/**
	 * Aggiunge un esame alla collezione
	 * @param e
	 */
	public void addEsame(Esame e) {
		esami.add(e);
	}

	/**
	 * Rimuove un esame dalla collezione
	 * @param e
	 */
	public void removeEsame(Esame e) {
		esami.remove(e);
	}
	
	/**
	 * Legge uno studente da tastiera
	 * @return Studente(nome, cognome, matricola)
	 */
	public static Studente read() {
		Scanner sc=new Scanner(System.in);
		
		String nome="", cognome="", matricolaS="";
		int matricola=0;
		
		System.out.print("Nome: ");
		nome=sc.nextLine();
		if(nome.equals(""))return null;
		
		System.out.print("Cognome: ");
		cognome=sc.nextLine();
		if(cognome.equals(""))return null;
		
		try {
			System.out.print("Matricola: ");
			matricolaS = sc.nextLine();
			if (matricolaS.equals(""))
				return null;
			matricola = Integer.parseInt(matricolaS);
		} catch (NumberFormatException e) {
			System.err.println("Matricola inserita non conforme, l'inserimento dello studente verrà annullato");
			return null;
		}
		
		return new Studente(nome, cognome, matricola);
	}
	
	/**
	 * Legge uno studente da file
	 * @param sc
	 * @return Studente(nome, cognome, matricola)
	 */
	public static Studente read(Scanner sc) {
		String nome="", cognome="", matricolaS="";
		int matricola=0;
		
		if(!sc.hasNext())return null;
		nome=sc.next();

		if(!sc.hasNext())return null;
		cognome=sc.next();

		if(!sc.hasNext())return null;
		matricolaS=sc.next();
		matricola=Integer.parseInt(matricolaS);
		//TODO exception parseException
		
		return new Studente(nome, cognome, matricola);
	}
	
	/**
	 * Identifica un oggetto con un intero univoco
	 * @return int
	 */
	@Override
	public int hashCode() {
		final int prime = Costante.NUMERO_PRIMO; //i numeri primi aiutano a non avere collisioni
		int result = matricola;
		//possiamo scrivere solo matricola in quanto l'oggetto rappresentato da matricola è già univoco
		result = prime * result + matricola;
		return result;
	}

	/**
	 * Confronta due oggetti - ottiene true se due oggetti sono uguali, false altrimenti
	 * @param s
	 * @return boolean
	 * @see java.lang.Object
	 */
	public boolean equals(Studente s) {
		//in questo caso sapendo la matricola possiamo implementare solo un if
		if(matricola==s.matricola)
			return true;
		return false;
	}
	
	/**
	 * Confronta due oggetti restituendo l'ordinamento
	 * @param s
	 * @return int
	 */
	@Override
	public int compareTo(Studente s) {
		String matricolaS=String.valueOf(matricola);
		String altraMatricolaS=String.valueOf(s.getMatricola());
		
		//nessuna condizione, la matricola è sempre univoca
		return matricolaS.compareTo(altraMatricolaS);
	}

	/**
	 * Visualizza su schermo uno studente
	 */
	public void print() {
		System.out.println(nome+" "+cognome+" "+matricola);
	}

	/**
	 * Scrive uno studente su file
	 * @param PrintStream
	 */
	public void print(PrintStream ps) {
		ps.println(nome+" "+cognome+" "+matricola);
	}

	/**
	 * Converte uno studente in una stringa
	 */
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", esami=" + esami
				+ "]";
	}

	private String nome, cognome;
	private int matricola;
	private List<Esame> esami;
}
