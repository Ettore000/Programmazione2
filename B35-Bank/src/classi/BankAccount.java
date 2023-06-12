package classi;

import java.io.PrintStream;
import java.util.Scanner;

import util.Costante;

/**
 * BankAccount: modella un conto corrente bancario
 */
public class BankAccount {
	/**
	 * Crea un nuovo conto con bilancio iniziale
	 * @param nomeIntestatario
	 * @param massimoScoperto
	 * @param balance
	 */
	public BankAccount(String nomeIntestatario, double massimoScoperto, double balance) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=massimoScoperto;
		this.balance = balance;
	}
	
	/**
	 * Crea un nuovo conto specificando il denaro iniziale
	 * @param nomeIntestatario
	 * @param balance
	 */
	public BankAccount(String nomeIntestatario, double balance) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=Costante.MASSIMO_SCOPERTO;
		this.balance = balance;
	}

	/**
	 * Crea un nuovo conto senza aggiungere denaro
	 * @param nomeIntestatario
	 * @param massimoScoperto
	 */
	public BankAccount(String nomeIntestatario, double massimoScoperto) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=massimoScoperto; //è la somma per cui si può andare sotto il bilancio
		this.balance = 0;
	}

	/**
	 * Crea un nuovo conto con massimo mensile scoperto predefinito per un normale privato
	 * @param nomeIntestatario
	 */
	//massimo scoperto mensile predefinito
	public BankAccount(String nomeIntestatario) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=100;
		this.balance = 0;
	}

	/**
	 * Ottiene il nome dell'intestatario
	 * @return nomeIntestatario
	 */
	public String getNomeIntestatario() {
		return nomeIntestatario;
	}

	/**
	 * Ottiene il massimo scoperto mensile
	 * @return massimoScoperto
	 */
	public double getMassimoScoperto() {
		return massimoScoperto;
	}

	/**
	 * Modifica il massimo scoperto mensile
	 * @param massimoScoperto
	 */
	public void setMassimoScoperto(double massimoScoperto) {
		this.massimoScoperto=massimoScoperto;
	}

	/**
	 * Ottiene il saldo
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Deposita denaro sul conto corrente
	 * @param amount
	 */
	public void deposit(double amount) {
		System.out.println("Sto depositando €"+amount);
		this.balance+=amount;
	}

	/**
	 * Preleva denaro dal conto corrente
	 * @param amount
	 */
	public void withdraw(double amount) {
		//verifica sulla possibilità di prelevare
		if (amount<=balance) {
			System.out.println("Sto prelevando €"+amount);
			this.balance-=amount;
		} else {
			System.out.println("Saldo di €"+amount+" non disponibile sul conto");
			System.out.println("Il tuo saldo disponibile e' di €"+balance);
		}
	}
	
	/**
	 * Legge un Conto corrente bancario da tastiera
	 * @return BankAccount(nomeIntestatario, massimoScoperto, balance)
	 */
	public static BankAccount read() {
		Scanner sc=new Scanner(System.in);
		
		String nomeIntestatario="";
		double massimoScoperto=0, balance=0;
		
		System.out.print("Nome intestatario: ");
		nomeIntestatario=sc.nextLine();
		if(nomeIntestatario.equals(""))return null;
		
		System.out.print("Massimo scoperto: ");
		massimoScoperto=sc.nextDouble();sc.nextLine();
		if(massimoScoperto==0)return null;
		
		System.out.print("Bilancio: ");
		balance=sc.nextDouble();sc.nextLine();
		if(balance==0)return null; //anche se il bilancio può essere 0, in questo caso non deve esserlo
		
		return new BankAccount(nomeIntestatario, massimoScoperto, balance);
	}
	
	/**
	 * Legge un Conto corrente bancario da file
	 * @return BankAccount(nomeIntestatario, massimoScoperto, balance)
	 */
	public static BankAccount read(Scanner sc) {
		String nomeIntestatario="";
		double massimoScoperto=0, balance=0;
		
		if(!sc.hasNext())return null;
		nomeIntestatario=sc.next();
		
		if(!sc.hasNext())return null;
		massimoScoperto=sc.nextDouble();
		
		if(!sc.hasNext())return null;
		balance=sc.nextDouble();
		
		return new BankAccount(nomeIntestatario, massimoScoperto, balance);
	}

	/**
	 * Riassume un conto corrente
	 * @return stringa
	 */
	public String toString() {
		String stringa=nomeIntestatario+"\n"+massimoScoperto+"\n"+balance;

		return stringa;
	}
	
	/**
	 * Visualizza un conto corrente bancario
	 */
	public void print() {
		System.out.println("Nome intestatario: "+nomeIntestatario);
		System.out.println("Massimo scoperto: "+massimoScoperto);
		System.out.println("Bilancio: "+balance);
	}
	
	/**
	 * Scrive su file un conto corrente bancario
	 * @param ps
	 */
	public void print(PrintStream ps) {
		ps.print(nomeIntestatario+" "+massimoScoperto+" "+balance+"\n");
	}

	private String nomeIntestatario;
	private double massimoScoperto, balance;
}
