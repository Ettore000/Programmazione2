package classi;

import java.io.PrintStream;
import java.util.Scanner;

import util.Costante;

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
	public Esame(String materia, int voto, int matricolaStudente) {
		this.materia=materia;
		this.voto=voto;
		this.matricolaStudente=matricolaStudente;
		this.studente=null;
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
	public int getMatricolaStudente() {
		return matricolaStudente;
	}
	
	/**
	 * Ottiene uno studente associato a un esame
	 * @return studente
	 */
	public Studente getStudente() {
		return studente;
	}

	/**
	 * Modifica uno studente associato a un esame
	 * @param studente
	 */
	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	/**
	 * Legge un esame da tastiera
	 * @return Esame(materia, voto, matricolaStudente)
	 */
	public static Esame read() {
		Scanner sc=new Scanner(System.in);

		String materia="", matricolaStudenteS="", votoS="";
		int voto=0, matricolaStudente=0;

		System.out.print("Materia: ");
		materia=sc.nextLine();
		if(materia.equals(""))return null;
		
		
		try {
			System.out.print("Voto: ");
			votoS = sc.nextLine();
			if (votoS.equals(""))
				return null;
			voto = Integer.parseInt(votoS);
		} catch (NumberFormatException e) {
			System.err.println("Voto inserito non conforme, al voto verrà assegnato il valore "+Costante.VOTO_NON_VALIDO);
			System.err.println("Modificarlo il prima possibile");
			voto=Costante.VOTO_NON_VALIDO;//TODO giusto?
		}//TODO limite di voto 30 o 5
		
		try {
			System.out.print("Matricola studente: ");
			matricolaStudenteS = sc.nextLine();
			if (matricolaStudenteS.equals(""))
				return null;
			matricolaStudente = Integer.parseInt(matricolaStudenteS);
		} catch (Exception e) {
			System.err.println("Matricola studente inserita non conforme, l'inserimento dell'esame verrà annullato");
			return null;//TODO giusto?
		}
		
		return new Esame(materia, voto, matricolaStudente);
	}

	/**
	 * Legge un esame da file
	 * @param sc
	 * @return Esame(materia, voto, matricolaStudente)
	 */
	public static Esame read(Scanner sc) {
		String materia="", matricolaStudenteS="", votoS="";
		int voto=0, matricolaStudente=0;

		if(!sc.hasNext())return null;
		materia=sc.next();
		
		if(!sc.hasNext())return null;
		votoS=sc.next();
		voto=Integer.parseInt(votoS);

		if(!sc.hasNext())return null;
		matricolaStudenteS=sc.next();
		matricolaStudente=Integer.parseInt(matricolaStudenteS);

		return new Esame(materia, voto, matricolaStudente);
	}

	/**
	 * Identifica un oggetto con un intero univoco
	 * @return int
	 */
	@Override
	public int hashCode() {
		final int prime = Costante.NUMERO_PRIMO;
		int result = matricolaStudente;
		result = prime * result + materia.hashCode();
		result = prime * result + matricolaStudente;
		return result;
	}

	/**
	 * Confronta due oggetti - ottiene true se i due oggetti sono uguali, false altrimenti
	 * @param e
	 * @return boolean
	 */
	public boolean equals(Esame e) {
		if(materia.equals(e.materia))
			if(matricolaStudente==e.matricolaStudente)
				return true;
		return false;
	}

	/**
	 * Confronta due oggetti resituendo l'ordinamento
	 * @param e
	 * @return int
	 */
	@Override
	public int compareTo(Esame e) {
		String matricolaStudenteS=String.valueOf(matricolaStudente);
		String altraMatricolaStudente=String.valueOf(e.getMatricolaStudente());
		
		return matricolaStudenteS.compareTo(altraMatricolaStudente);
	}

	/**
	 * Visualizza su monitor un esame
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
	 * Converte un esame in una stringa
	 * @return String
	 */
	@Override
	public String toString() {
		return "Studente [materia=" + materia + ", voto=" + voto + ", matricolaStudente=" + matricolaStudente + "]";
	}

	private String materia;
	private int voto, matricolaStudente;
	private Studente studente;
}
