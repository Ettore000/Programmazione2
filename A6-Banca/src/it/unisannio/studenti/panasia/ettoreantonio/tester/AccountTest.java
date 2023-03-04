package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Account;

public class AccountTest {

	public static void main(String[] args) {
		// Creazione di un nuovo account con numero di conto "123456", saldo iniziale di 1000 euro e tasso di interesse del 5%
		Account account = new Account("123456", 1000, 0.05);
		
		// Deposito di 500 euro sul conto
		account.deposit(500);
		
		// Prelievo di 200 euro dal conto
		if (account.withdraw(200)) {
		    System.out.println("Prelievo effettuato");
		} else {
		    System.out.println("Fondi insufficienti");
		}
		
		// Aggiunta degli interessi maturati al saldo del conto
		account.addInterest();
		
		// Stampa delle informazioni sull'account
		System.out.println(account.toString());
	}

}
