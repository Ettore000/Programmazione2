package classi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Costante;

/**
 * Modella un registro contenente studenti e esami
 */
public class Registro {
	/**
	 * Crea un registro
	 * @param scStudente
	 * @param scEsami
	 */
	public Registro(Scanner scStudente, Scanner scEsami) {
		this.studenti=new ArrayList<Studente>();
		this.esami=new ArrayList<Esame>();

		Studente s=Studente.read(scStudente);
		while (s!=null) {
			studenti.add(s);
			s=Studente.read(scStudente);
		}

		Esame e=Esame.read(scEsami);
		while (e!=null) {
			//si vuole trovare uno studente attraverso la matricola
			Studente studenteTrovato=findStudenteByMatricola(e.getMatricolaStudente());
			e.setStudente(studenteTrovato); //si imposta lo studente trovato a un esame
			studenteTrovato.addEsame(e); //viene aggiunto un esame alla lista esami dello studente trovato
			esami.add(e); //un esame viene aggiunto alla lista esami
			e=Esame.read(scEsami);
		}
		
	}
	
	private Registro(List<Studente> studentiFilter, List<Esame> esamiFilter) {
		this.studenti=studentiFilter;
		this.esami=esamiFilter;
	}

	/**
	 * Cerca un esame in base a un criterio e al valore cercato
	 * @param matricola
	 * @return Studente
	 */
	public Studente findStudenteByMatricola(int matricola) {
		for (Studente studente : studenti) {
			if(studente.getMatricola()==matricola)
				return studente;
		}
		return null;
	}

	/**
	 * Filtra gli esami in base a un criterio
	 * @param materia
	 * @return Registro
	 */
	public Registro filterStudentiByNome(String nome) {
		List<Studente> studentiFilter=new ArrayList<Studente>();
		List<Esame> esamiFilter=new ArrayList<Esame>();
		
		for (Studente studente : studenti) {
			if(studente.getNome().equalsIgnoreCase(nome)) {
				studentiFilter.add(studente);
				esamiFilter.addAll(esami);
			}
		}
		return new Registro(studentiFilter, esamiFilter);
	}

	//TODO filterEsamiByMatricolaStudente(String matricolaStudente)
	//TODO filterEsamiByVoto(String voto)

	/**
	 * Ordina la collezione degli esami in base a un criterio e a un ordine specificato tra ascendente e discendente
	 * @param criterio
	 * @return Registro
	 */
	public Registro sortEsamiByMateria(String materia) {
		//TODO sorting ascendente
	}

	//TODO sortEsamiByMatricolaStudente(String matricolaStudente)
	//TODO sortEsamiByVoto(String voto)

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
	 * Visualizza su schermo una lista di studenti
	 */
	public void printStudenti() {
		System.out.println("Studenti");
		for (Studente studente : studenti) {
			studente.print();
		}
	}

	/**
	 * Visualizza su schermo una lista di esami
	 */
	public void printEsami() {
		System.out.println("Esami");
		for (Esame esame : esami) {
			esame.print();
		}
	}

	/**
	 * Visualizza su schermo una lista di studenti e una lista di esami
	 */
	public void print() {
		printStudenti();
		printEsami();
	}

	private List<Studente> studenti;
	private List<Esame> esami;
}
