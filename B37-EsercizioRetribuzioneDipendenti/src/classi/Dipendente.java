package classi;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Costante;

/**
 * Dipendente: modella la retribuzione di un dipendente
 */
public class Dipendente {
	/**
	 * Crea un profilo dipendente
	 * @param nome
	 * @param retribuzioneOraria
	 */
	public Dipendente(String nome, double retribuzioneOraria) {
		this.nome = nome;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	/**
	 * Crea un profilo dipendente in cui non viene specificata la retribuzione oraria,
	 * quindi viene applicato un valore predefinito
	 * @param nome
	 */
	public Dipendente(String nome) {
		this.nome = nome;
		this.retribuzioneOraria =Costante.RETRIBUZIONE_STANDARD;
	}

	/**
	 * Calcola la paga di un dipendente
	 * @param oreLavorate
	 * @return paga
	 */
	public double calcolaPaga(int oreLavorate) {
		double paga;
		if (oreLavorate<40) { //niente straordinari
			paga=oreLavorate*retribuzioneOraria;
		} else if (oreLavorate<(40+30)) { //straordinari fino a 30 ore
			paga=40*retribuzioneOraria+(oreLavorate-40)*(retribuzioneOraria*1.5); //straordinari pagati una volta e mezzo la normale retribuzione oraria
		} else { //straordinari oltre le 30 ore
			paga=40*retribuzioneOraria+30*(retribuzioneOraria*1.5); //vengono calcolate le ore fino al limite
			System.out.println("Hai superato le 30 ore di straordinario, le ore successive al limite massimo non verranno calcolate");
		}

		return paga;
	}

	/**
	 * Ottiene il nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Ottiene il valore della retribuzione oraria
	 * @return retribuzioneOraria
	 */
	public double getRetribuzioneOraria() {
		return retribuzioneOraria;
	}

	/**
	 * Modifica il valore della retribuzione oraria
	 * @param retribuzioneOraria
	 */
	public void setRetribuzioneOraria(double retribuzioneOraria) {
		this.retribuzioneOraria = retribuzioneOraria;
	}

	/**
	 * Legge un dipendente da tastiera
	 * @return Dipendente(nome, retribuzioneOraria)
	 */
	public static Dipendente read() {
		Scanner sc=new Scanner(System.in);

		String nome="";
		double retribuzioneOraria=0;

		System.out.print("Nome: ");
		nome=sc.next();
		if(nome.equals(""))return null;

		try {
			System.out.print("Retribuzione oraria: ");
			retribuzioneOraria = sc.nextDouble();
			if(retribuzioneOraria==0)return null;
		} catch (InputMismatchException e) {
			System.err.println("input non valido, la retribuzione oraria assegnata sarà di €"+Costante.RETRIBUZIONE_STANDARD);
			sc.nextLine();
			retribuzioneOraria=Costante.RETRIBUZIONE_STANDARD;
		}

		return new Dipendente(nome, retribuzioneOraria);
	}

	/**
	 * Legge un dipendente da file
	 * @return Dipendente(nome, retribuzioneOraria)
	 */
	public static Dipendente read(Scanner sc) {
		String nome="";
		double retribuzioneOraria=0;

		if(!sc.hasNext())return null;
		nome=sc.next();

		if(!sc.hasNext())return null;
		retribuzioneOraria=sc.nextDouble();

		return new Dipendente(nome, retribuzioneOraria);
	}

	//Riassunto del dipendente
	/**
	 * Riassunto del dipendente
	 * @return stringa con nome e retribuzione oraria
	 */
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", retribuzioneOraria=" + retribuzioneOraria +"]";
	}

	private String nome;
	private double retribuzioneOraria;
}
