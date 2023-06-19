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
			esami.add(e);
			e=Esame.read(scEsami);
		}
		
		//TODO find
	}
	
	/**
	 * Cerca un esame in base a un criterio e al valore cercato
	 * @param matricolaStudente
	 * @return Registro
	 */
	public Registro findEsameByMatricolaStudente(String matricolaStudente) {
		//TODO
	}
	
	/**
	 * Filtra gli esami in base a un criterio
	 * @param materia
	 * @return Registro
	 */
	public Registro filterEsamiByMateria(String materia) {
		//TODO
	}
	
	//TODO filterEsamiByMatricolaStudente(String matricolaStudente)
	//TODO filterEsamiByVoto(String voto)
	
	/**
	 * Ordina la collezione degli esami in base a un criterio e a un ordine specificato tra ascendente e discendente
	 * @param criterio
	 * @return Registro
	 */
	public Registro sortEsamiByMateria(String materia) {
		//TODO
	}
	
	//TODO sortEsamiByMatricolaStudente(String matricolaStudente)
	//TODO sortEsamiByVoto(String voto)
	
	//TODO si deve implementare anche getEsame?
	
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
	
	public void printStudenti() {
		System.out.println("Studenti");
		for (Studente studente : studenti) {
			studente.print();
		}
	}
	
	public void printEsami() {
		System.out.println("Esami");
		for (Esame esame : esami) {
			esame.print();
		}
	}
	
	public void print() {
		System.out.println("Studenti");
		for (Studente studente : studenti) {
			studente.print();
		}
		
		System.out.println("Esami");
		for (Esame esame : esami) {
			esame.print();
		}
	}

	private List<Studente> studenti;
	private List<Esame> esami;
}
