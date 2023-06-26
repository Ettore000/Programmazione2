package util;

import java.util.Comparator;

import classi.Esame;

/**
 * Modella un metodo di confronto aggiuntivo per gli esami
 */
public class EsameComparator implements Comparator<Esame> {

	/**
	 * Confronta due esami restituendo l'ordinamento per materia -> per voto -> per matricola studente
	 * @return int
	 */
	@Override
	public int compare(Esame e1, Esame e2) {
		if(!e1.getMateria().equalsIgnoreCase(e2.getMateria()))
			return e1.getMateria().compareToIgnoreCase(e2.getMateria());
		if(e1.getVoto()!=e2.getVoto())
			return e1.getVoto() - e2.getVoto();
		return e1.getMatricolaStudente().compareToIgnoreCase(e2.getMatricolaStudente());
	}

}
