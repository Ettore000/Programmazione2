package util;

import java.util.Comparator;

import classi.Esame;

/**
 * Modella metodi speciali di confronto degli attributi di un esame
 */
public class EsameComparatorByMateria implements Comparator<Esame> {

	@Override
	public int compare(Esame e1, Esame e2) {
		if(!e1.getMateria().equalsIgnoreCase(e2.getMateria()))
			return e1.getMateria().compareTo(e2.getMateria());
		if(e1.getVoto()!=e2.getVoto())
			return e1.getVoto()-e2.getVoto();
		return e1.getMatricolaStudente().compareTo(e2.getMatricolaStudente());
	}

}
