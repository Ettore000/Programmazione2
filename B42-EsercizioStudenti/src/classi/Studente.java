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
	public Studente(String nome, String cognome, String matricola) {
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
	public String getMatricola() {
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
	 * Cerca un esame in base a un criterio e al valore cercato
	 * @param criterio
	 * @param nomeEsame
	 * @return Esame
	 */
	public Esame findEsame(String criterio, String valore) {
		for (Esame esame : esami) {
			if(criterio.equalsIgnoreCase("materia") && esame.getMateria().equalsIgnoreCase(valore)) {
				return esame;
			} else if(criterio.equalsIgnoreCase("voto") && esame.getVoto()==Integer.parseInt(valore)) {
				return esame;
			} else if(criterio.equalsIgnoreCase("matricolaStudente") && esame.getMatricolaStudente().equalsIgnoreCase(valore)) {
				return esame;
			}
		}
		return null;
	}
	
	/**
	 * Filtra gli esami in base a un criterio
	 * @param criterio
	 * @return esamiFiltrati
	 */
	public List<Esame> filterEsami(String criterio) {
		List<Esame> esamiFiltrati=new ArrayList<Esame>();
		
		for (Esame esame : esami) {
			if(criterio.equalsIgnoreCase("materia")) {
				esamiFiltrati.add(esame);
			} else if(criterio.equalsIgnoreCase("voto")) {
				esamiFiltrati.add(esame);
			} else if(criterio.equalsIgnoreCase("matricolaStudente")) {
				esamiFiltrati.add(esame);
			}
		}
		return esamiFiltrati;
	}
	
	/**
	 * Ordina la collezione degli esami in base a un criterio e a un ordine specificato tra ascendente e discendente
	 * @param criterio
	 * @param ordine
	 * @return esamiOrdinati
	 */
	public List<Esame> orderEsami(String criterio, String ordine) {
		List<Esame> esamiOrdinati=new ArrayList<Esame>();
		
		//TODO come posso implementarlo?
		//TODO come posso sfruttare il metodo compareTo()?
		
		return esamiOrdinati;
	}
	
	/**
	 * Ottiene la media dei voti degli esami svolti da uno studente
	 * @return votoMedio
	 */
	public double getVotoMedio() {
		double votoMedio=0;
		int conta=0, somma=0;
		
		for (Esame esame : esami) {
			somma+=esame.getVoto();
			conta++;
		}
		votoMedio=somma/conta;
		
		return votoMedio;
	}
	
	/**
	 * Ottiene il voto con valore massimo
	 * @return votoMassimo
	 */
	public int getVotoMassimo() {
		int votoMassimo=Costante.VOTO_MINIMO;
		
		for (Esame esame : esami) {
			if(esame.getVoto()>votoMassimo)
				votoMassimo=esame.getVoto();
		}
		
		return votoMassimo;
	}
	
	/**
	 * Ottiene il voto con valore minimo
	 * @return votoMinimo
	 */
	public int getVotoMinimo() {
		int votoMinimo=Costante.VOTO_MASSIMO;
		
		for (Esame esame : esami) {
			if(esame.getVoto()<votoMinimo)
				votoMinimo=esame.getVoto();
		}
		
		return votoMinimo;
	}
	
	/**
	 * Legge uno studente da tastiera
	 * @return Studente(nome, cognome, matricola)
	 */
	public static Studente read() {
		Scanner sc=new Scanner(System.in);
		
		String nome="", cognome="", matricola="";
		
		System.out.print("Nome: ");
		nome=sc.nextLine();
		if(nome.equals(""))return null;
		
		System.out.print("Cognome: ");
		cognome=sc.nextLine();
		if(cognome.equals(""))return null;
		
		System.out.print("Matricola: ");
		matricola=sc.nextLine();
		if(matricola.equals(""))return null;
		
		return new Studente(nome, cognome, matricola);
	}
	
	/**
	 * Legge uno studente da file
	 * @param sc
	 * @return Studente(nome, cognome, matricola)
	 */
	public static Studente read(Scanner sc) {
		String nome="", cognome="", matricola="";
		
		if(!sc.hasNext())return null;
		nome=sc.next();

		if(!sc.hasNext())return null;
		cognome=sc.next();

		if(!sc.hasNext())return null;
		matricola=sc.next();
		
		return new Studente(nome, cognome, matricola);
	}
	
	/**
	 * Visualizza uno studente
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
	 * Identifica un oggetto con un intero univoco
	 * @return int
	 */
	@Override
	public int hashCode() {
		final int prime = 31; //i numeri primi aiutano a non avere collisioni
		int result = 1;
		//possiamo scrivere solo matricola in quanto l'oggetto rappresentato da matricola è già univoco
		result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
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
		if(matricola.equals(s.matricola))
			return true;
		return false;
	}
	
	/**
	 * Confronta due oggetti - ottiene informazioni circa l'ordinamento degli oggetti
	 * @param s
	 * @return int
	 */
	@Override
	public int compareTo(Studente s) {
		return matricola.compareTo(s.matricola); // se sono uguali restituisce zero
	}

	/**
	 * Riassume uno studente
	 */
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", esami=" + esami
				+ "]";
	}

	private String nome, cognome, matricola;
	private List<Esame> esami;
}
