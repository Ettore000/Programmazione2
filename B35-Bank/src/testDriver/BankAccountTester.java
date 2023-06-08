/**
 * Test dei metodi della classe BankAccount
 */

package testDriver;

import classi.BankAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount account1=new BankAccount("Luca"); //bilancio iniziale 0
		BankAccount account2=new BankAccount("Luca", 500, 1000);

		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());

		//deposito
		account1.deposit(150);
		account2.deposit(510);

		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());

		//prelievo
		account1.withdraw(20);
		account2.withdraw(50);

		System.out.println("Saldo account 1: "+account1.getBalance());
		System.out.println("Saldo account 2: "+account2.getBalance());
	}

}
