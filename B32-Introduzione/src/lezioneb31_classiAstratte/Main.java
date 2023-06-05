/* Lezione 31
 * - Classi astratte
 * 
 * - cosa sono
 * - creare classe astratta veicolo
 * - creare classi figlie macchina e bicicletta
 * - metodi astratti
 */

package lezioneb31_classiAstratte;

public class Main {

	public static void main(String[] args) {
		//sono delle classi ristrette che non possono essere utilizzate per creare degli oggetti
		//sono delle classi che sono ereditate da altre classi
		
		Automobile automobile=new Automobile();
		
		automobile.frena();

	}

}
