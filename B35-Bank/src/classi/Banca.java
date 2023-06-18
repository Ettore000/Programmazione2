package classi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Modella una banca che gestisce dei conti correnti
 * @see BankAccount
 */
public class Banca {
	/**
	 * Crea una banca
	 */
	public Banca(Scanner sc) {
		this.contiCorrenti=new ArrayList<BankAccount>(); //implementazione specifica per la variabile
	//slide input output, per read7PR LOOP 
	}
	

	/**
	 * Ottiene una lista di conti correnti gestiti dalla banca
	 * @return contiCorrenti
	 */
	public List<BankAccount> getContiCorrenti() {
		return contiCorrenti;
	}

	/**
	 * Aggiunge un conto corrente alla lista
	 * @param conto
	 */
	public void addConto(BankAccount conto) {
		contiCorrenti.add(conto);
	}

	/**
	 * Elimina un conto corrente dalla lista
	 * @param conto
	 */
	public void removeConto(BankAccount conto) {
		contiCorrenti.remove(conto);
	}

	/**
	 * Cerca un conto corrente per nome
	 * @param nomeIntestatario
	 * @return conto
	 */
	public BankAccount cercaContoCorrentePerNome(String nomeIntestatario) {
		for (BankAccount conto : contiCorrenti) {
			if (conto.getNomeIntestatario().equals(nomeIntestatario)) {
				return conto;
			}
		}
		return null;
	}

	/**
	 * Calcola il saldo totale che possiede la banca sommando tutti i conti correnti che gestisce
	 * @return saldoTotale
	 */
	public double calcolaSaldoTotaleBanca() {
		double saldoTotale=0;
		for (BankAccount conto : contiCorrenti) {
			saldoTotale+=conto.getBalance();
		}
		return saldoTotale;
	}

	/**
	 * Visualizza tutti i conti correnti
	 */
	public void print() {
		for (BankAccount conto : contiCorrenti) {
			conto.print();
			System.out.println("--------------------------------");
		}
	}
	
	//TODO riordina conti correnti
	
	//TODO conto corrente con il massimo bilancio
	
	//TODO conto corrente con il minimo bilancio
	
	//TODO valore medio di bilancio dei conti correnti

	//TODO leggi conti correnti da file

	//TODO scrivi conti correnti su file

	private List<BankAccount> contiCorrenti;
	/*
	 * la dichiarazione con List<>
	 * fornisce una maggiore flessibilità nel caso si desideri
	 * cambiare l'implementazione della lista in futuro
	 */
}
