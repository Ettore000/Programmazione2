/**
 * vengono pagate ai dipendenti le ore lavorate senza straordinari
 */

package scenari;

import classi.Dipendente;

public class PagaOrdinaria {

	public static void main(String[] args) {
		Dipendente d1=new Dipendente("Luca"); //dipendente con paga oraria standard
		Dipendente d2=new Dipendente("Marco", 8.2);
		
		System.out.println(d1.getNome()+" è stato pagato €"+d1.calcolaPaga(31));
		System.out.println(d2.getNome()+" è stato pagato €"+d2.calcolaPaga(26));
	}

}
