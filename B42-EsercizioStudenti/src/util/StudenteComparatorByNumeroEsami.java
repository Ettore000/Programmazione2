package util;

import java.util.Comparator;

import classi.Studente;

/**
 * Modella un metodo di confronto aggiuntivo per gli studenti
 */
public class StudenteComparatorByNumeroEsami implements Comparator<Studente> {
	/**
	 * Confronta due studenti restituendo l'ordinamento per numero di esami superati -> cognome -> per nome -> per matricola
	 * @return int
	 */
	@Override
	public int compare(Studente s1, Studente s2) {
		if(s1.getNumeroEsami()!=s2.getNumeroEsami())
			return s1.getNumeroEsami() - s2.getNumeroEsami();
		if(!s1.getCognome().equals(s2.getCognome()))
			return s1.getCognome().compareToIgnoreCase(s2.getCognome());
		if(!s1.getNome().equalsIgnoreCase(s2.getNome()))
			return s1.getNome().compareToIgnoreCase(s2.getNome());
		return s1.getMatricola().compareToIgnoreCase(s2.getMatricola());
	}

}
