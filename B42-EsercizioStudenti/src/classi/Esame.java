package classi;

import java.io.PrintStream;
import java.util.Scanner;

import util.Costante;
import util.VotoOltreIlMassimoException;
import util.VotoOltreIlMinimoException;

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
	 * Modifica il voto di un esame in caso il voto inserito nel read non sia conforme
	 * @param voto
	 */
	public void setVoto(int voto) {
		this.voto = voto;
	}

	/**
	 * Ottiene la matricola dello studente che ha svolto l'esame
	 * @return matricolaStudente
	 */
	public String getMatricolaStudente() {
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

		String materia="", matricolaStudente="", votoS="";
		int voto=0;

		System.out.print("Materia: ");
		materia=sc.nextLine();
		if(materia.equals(""))return null;


		try {
			System.out.print("Voto: ");
			votoS = sc.nextLine();
			if (votoS.equals(""))return null;
			voto = Integer.parseInt(votoS);
			if(voto<18) {
				throw new VotoOltreIlMinimoException("Il voto inserito va oltre il minimo consentito, al voto non verra' assegnato nessun valore");
			} else if(voto>30) {
				throw new VotoOltreIlMassimoException("Il voto inserito va oltre il massimo consentito, al voto non verra' assegnato nessun valore");
			}
		} catch (NumberFormatException e) {
			System.err.println("Voto inserito non conforme, al voto non verra' assegnato nessun valore");
		}

		System.out.print("Matricola studente: ");
		matricolaStudente=sc.nextLine();
		if(matricolaStudente.equals(""))return null;

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
		votoS=sc.next();
		voto=Integer.parseInt(votoS);

		if(!sc.hasNext())return null;
		matricolaStudente=sc.next();

		return new Esame(materia, voto, matricolaStudente);
	}

	/**
	 * Identifica un oggetto con un intero univoco
	 * @return int
	 */
	@Override
	public int hashCode() {
		final int prime = Costante.NUMERO_PRIMO;
		int result = Costante.INTERO_UNITARIO;//TODO giusto?

		result = prime * result + materia.hashCode();
		result = prime * result + matricolaStudente.hashCode();

		return result;
	}

	/**
	 * Confronta due oggetti - ottiene true se i due oggetti sono uguali, false altrimenti
	 * @param e
	 * @return boolean
	 */
	public boolean equals(Esame e) {
		if(materia.equals(e.materia))
			if(matricolaStudente.equals(e.getMatricolaStudente()))
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
		if(!materia.equalsIgnoreCase(e.getMateria())) {
			return materia.compareToIgnoreCase(e.getMateria());
		}
		return matricolaStudente.compareToIgnoreCase(e.getMatricolaStudente());
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

	private String materia, matricolaStudente;
	private int voto;
	private Studente studente;
}
