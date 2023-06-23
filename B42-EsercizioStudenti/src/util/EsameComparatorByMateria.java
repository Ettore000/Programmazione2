package util;

import java.util.Comparator;

import classi.Esame;

/**
 * Modella metodi speciali di confronto degli attributi di un esame
 */
public class EsameComparatorByMateria implements Comparator<Esame> {

	@Override
	public int compare(Esame e1, Esame e2) {
		if(e1.getMateria()<e2.hashCode())return -1;
		if(e1.hashCode()==e2.hashCode())return 0;
		return 1;
	}

}
