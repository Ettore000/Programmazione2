

package scenari;

import classi.BankAccount;

/**
 * Scenario di prelievo
 */

public class Prelievo {

	public static void main(String[] args) {
		BankAccount account=new BankAccount("Luca", 500, 1525.21);
		System.out.println("Puoi prelevare fino a €"+account.getBalance());
		
		//prelievo
		account.withdraw(70);
		
		//stampa del bilancio
		System.out.println("Il tuo saldo residuo è di €"+account.getBalance());
	}

}
