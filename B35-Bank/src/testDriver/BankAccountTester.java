package testDriver;

import classi.BankAccount;

/**
 * BankAccountTester: test driver della classe BankAccount
 */
public class BankAccountTester {

	public static void main(String[] args) {
		//Crea 2 conti correnti
		BankAccount account1=new BankAccount("Luca"); //bilancio iniziale 0
		BankAccount account2=new BankAccount("Marco", 500, 1000);

		//stampa il saldo disponibile dei due conti correnti
		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());

		//deposita
		account1.deposit(150);
		account2.deposit(510);

		//stampa il saldo al netto del desposito
		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());

		//preleva
		account1.withdraw(20);
		account2.withdraw(50);

		//stampa il saldo al netto del prelievo
		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());
	}

}
