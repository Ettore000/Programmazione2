/**
 * Scenario di gestione di pedaggi nel caso in cui ci siano più caselli
 * sparsi per le uscite delle autostrade
 */

package scenari;

import classi.Camion;
import classi.Casello;

public class GestioneAutostrade {

	public static void main(String[] args) {
		//creazione di più caselli
		Casello cas1=new Casello(4.32, 6);
		Casello cas2=new Casello(1, 20);
		Casello cas3=new Casello(15, 5.26);
		
		Camion c1=new Camion(5, 12500);
		Camion c2=new Camion(2, 5000);
		Camion c3=new Camion(6, 17000);
		
		System.out.println("\n\n___Casello numero 1___\n");
		cas1.calcolaPedaggio(c1);
		cas1.calcolaPedaggio(c2);
		cas1.calcolaPedaggio(c3);
		cas1.transitiNonRiscossi();
		cas1.riscuotiTransiti();
		
		System.out.println("\n\n___Casello numero 2___\n");
		cas2.calcolaPedaggio(c1);
		cas2.calcolaPedaggio(c2);
		cas2.calcolaPedaggio(c3);
		cas2.transitiNonRiscossi();
		cas2.riscuotiTransiti();
		
		System.out.println("\n\n___Casello numero 3___\n");
		cas3.calcolaPedaggio(c1);
		cas3.calcolaPedaggio(c2);
		cas3.calcolaPedaggio(c3);
		cas3.transitiNonRiscossi();
		cas3.riscuotiTransiti();
	}

}
