package testDriver;

import classi.Banca;
import classi.BankAccount;

/**
 * BancaTester: test driver della classe Banca
 */
public class BancaTester {

	public static void main(String[] args) {
		Banca b=new Banca();
		
		b.apriConto(new BankAccount("Luca", 12000));
	}

}
