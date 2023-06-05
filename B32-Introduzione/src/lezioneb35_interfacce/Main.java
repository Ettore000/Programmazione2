/* Lezione 35
 * - Interfacce
 */

package lezioneb35_interfacce;

public class Main {

	public static void main(String[] args) {
		//simili alle classi astratte, dove non si doveva specificare il corpo dei metodi
		//unisce dei comportamenti a oggetti che non hanno correlazioni fra di loro
		//va implementato
		//esempio macchine, animali, persone: -> muovi()
		
		Leone leone=new Leone();
		Gazzella gazzella=new Gazzella();
		Pesce pesce=new Pesce();
		
		leone.caccia();
		gazzella.scappa();
		pesce.caccia();
		pesce.scappa();
		
		//mentre la classe astratta viene ereditata
		//un'interfaccia da funzionalità extra
		//possiamo implementare più di un'interfaccia a una classe, come nel caso di Pesce
	}

}
