package scenari;

import classi.BankAccount;

/**
 * Prelievo: scenario generico di prelievo
 */

public class Prelievo {

	public static void main(String[] args) {
		//crea un conto corrente
		BankAccount account=new BankAccount("Luca", 500, 1525.21);
		//stampa il saldo disponibile
		System.out.println("Puoi prelevare fino a €"+account.getBalance());
		
		//preleva
		account.withdraw(70);
		
		//stampa il saldo corrente dopo il prelievo
		System.out.println("Il tuo saldo residuo è di €"+account.getBalance());
	}

}
