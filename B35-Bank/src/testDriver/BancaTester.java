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
		b.apriConto(new BankAccount("Luca", 12000));
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotale());

		b.apriConto(new BankAccount("Marco", 25850.24));
		b.apriConto(new BankAccount("Andrea", 1520.51));
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotale());

		//chiudi conto
		b.chiudiConto(b.cercaContoCorrentePerNome("Marco"));//TODO
		b.visualizzaContiCorrenti();

		System.out.println(b.calcolaSaldoTotale());
		
		//cerca per nome
		b.cercaContoCorrentePerNome("Luca").print();
	}

}
