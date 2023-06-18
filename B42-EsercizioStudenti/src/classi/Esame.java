package classi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Modella un esame
 */
public class Esame implements Comparable<Esame>{
	/**
	 * Crea un esame
	 * @param nome
	 * @param cognome
	 * @param matricola
	 */
	public Esame(String materia, int voto, String matricolaStudente) {
		this.materia=materia;
		this.voto=voto;
		this.matricolaStudente=matricolaStudente;
	}

	/**
	 * Ottiene la materia
	 * @return materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * Ottiene il voto
	 * @return voto
	 */
	public int getVoto() {
		return voto;
	}

	/**
	 * Ottiene la matricola dello studente che ha svolto l'esame
	 * @return matricolaStudente
	 */
	public String getMatricolaStudente() {
		return matricolaStudente;
	}
	
	//TODO giusto utilizzare Studente così all'interno di esami?
	/**
	 * Ottiene uno studente associato all'esame
	 * @return studente
	 */
	public Studente getStudente() {
		return studente;
	}

	/**
	 * Legge un esame da tastiera
	 * @return Esame(materia, voto, matricolaStudente)
	 */
	public static Esame read() {
		Scanner sc=new Scanner(System.in);

		String materia="", matricolaStudente="", votoS="";
		int voto=0;

		System.out.print("Materia: ");
		materia=sc.nextLine();
		if(materia.equals(""))return null;

		System.out.print("Matricola studente: ");
		matricolaStudente=sc.nextLine();
		if(matricolaStudente.equals(""))return null;

		System.out.print("Voto: ");
		votoS=sc.nextLine();
		if(votoS.equals(""))return null;
		voto=Integer.parseInt(votoS);

		return new Esame(materia, voto, matricolaStudente);
	}

	/**
	 * Legge un esame da file
	 * @param sc
	 * @return Esame(materia, voto, matricolaStudente)
	 */
	public static Esame read(Scanner sc) {
		String materia="", matricolaStudente="", votoS="";
		int voto=0;

		if(!sc.hasNext())return null;
		materia=sc.next();

		if(!sc.hasNext())return null;
		matricolaStudente=sc.next();

		if(!sc.hasNext())return null;
		votoS=sc.next();
		voto=Integer.parseInt(votoS);

		return new Esame(materia, voto, matricolaStudente);
	}

	/**
	 * Visualizza un esame
	 */
	public void print() {
		System.out.println(materia+" "+voto+" "+matricolaStudente);
	}

	/**
	 * Scrive un esame su file
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.println(materia+" "+voto+" "+matricolaStudente);
	}

	/**
	 * Confronta due oggetti - ottiene true se i due oggetti sono uguali, false altrimenti
	 * @param e
	 * @return boolean
	 */
	public boolean equals(Esame e) {
		if(materia.equals(e.materia))
			if(matricolaStudente.equals(e.matricolaStudente))
				return true;
		return false;
	}

	//TODO giusto equals all'interno?
	/**
	 * Confronta due oggetti - ottiene informazioni sull'ordinamento dei due oggetti
	 * @param e
	 * @return int
	 */
	@Override
	public int compareTo(Esame e) {
		/*
		 * Se le materie sono diverse, restituisce il risultato del confronto tra le stringhe materia dei due oggetti
		 * 
		 * Questo permette di ordinare gli esami in base alla materia in modo crescente o decrescente
		 */
		if(!materia.equals(e.materia))return materia.compareTo(e.materia);
		//Altrimenti restituisce il risultato del confronto tra le stringhe matricolaStudente
		return matricolaStudente.compareTo(e.matricolaStudente);
	}

	/**
	 * Riassume un esame
	 */
	@Override
	public String toString() {
		return "Studente [materia=" + materia + ", voto=" + voto + ", matricolaStudente=" + matricolaStudente + "]";
	}

	private String materia, matricolaStudente;
	private int voto;
	private Studente studente; //TODO come si inizializza?
}
