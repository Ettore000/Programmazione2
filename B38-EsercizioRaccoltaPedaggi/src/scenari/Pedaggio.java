/**
 * Scenario di gestione di pedaggi in un casello autostradale
 */

package scenari;

import classi.Camion;
import classi.Casello;

public class Pedaggio {

	public static void main(String[] args) {
		//creazione casello
		Casello casello=new Casello();
		
		//creazione camion
		Camion c1=new Camion(5, 12500);
		Camion c2=new Camion(2, 5000);
		Camion c3=new Camion(6, 17000);
		
		//transito del primo camion
		casello.calcolaPedaggio(c1);
		
		//il casellante controlla il display
		casello.transitiNonRiscossi();
		
		//transito del secondo camion
		casello.calcolaPedaggio(c2);
		
		//il casellante vuole riscuotere la cassa
		casello.riscuotiTransiti();
		
		//transito del terzo camion
		casello.calcolaPedaggio(c3);
		
		//il casellante controlla il display
		casello.transitiNonRiscossi();
	}

}
