package testDriver;

import classi.Banca;
import classi.BankAccount;

/**
 * BancaTester: test driver della classe Banca
 */
public class BancaTester {

	public static void main(String[] args) {
		//crea banca
		Banca b=new Banca();

		//apri conto
		b.addConto(new BankAccount("Luca", 12000));
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotaleBanca());

		b.addConto(new BankAccount("Marco", 25850.24));
		b.addConto(new BankAccount("Andrea", 1520.51));
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotaleBanca());

		//chiudi conto
		b.removeConto(b.cercaContoCorrentePerNome("Marco"));//TODO
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotaleBanca());
		
		//cerca per nome
		b.cercaContoCorrentePerNome("Luca").print();
	}

}
