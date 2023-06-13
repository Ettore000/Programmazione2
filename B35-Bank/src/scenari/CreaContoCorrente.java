package scenari;

import classi.BankAccount;

/**
 * Scenario di creazione di un conto corrente da tastiera
 */
public class CreaContoCorrente {

	public static void main(String[] args) {
		BankAccount ba=BankAccount.read();
		
		ba.print();
	}

}
