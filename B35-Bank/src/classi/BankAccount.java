package classi;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import util.Costante;

/**
 * Modella un conto corrente bancario
 */
public class BankAccount implements Comparable<BankAccount>{
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
		this.massimoScoperto=Costante.MASSIMO_SCOPERTO; //è la somma per cui si può andare sotto il bilancio
		this.balance = balance;
	}

	/**
	 * Crea un nuovo conto con massimo mensile scoperto predefinito per un normale privato
	 * @param nomeIntestatario
	 */
	//massimo scoperto mensile predefinito
	public BankAccount(String nomeIntestatario) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=Costante.MASSIMO_SCOPERTO;
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
			throw new IllegalArgumentException("Saldo di €"+amount+" non disponibile sul conto");
			//però in questo modo il programma viene arrestato
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

		try {
			System.out.print("Massimo scoperto: ");
			String massimoScopertoS = sc.nextLine();
			massimoScoperto= Double.parseDouble(massimoScopertoS);
		} catch (NumberFormatException e) {
			System.err.println("Input non valido, al massimo scoperto verra assegnato il valore di €"+Costante.MASSIMO_SCOPERTO);
			massimoScoperto=Costante.MASSIMO_SCOPERTO;
		}

		try {
			System.out.print("Bilancio: ");
			balance=sc.nextDouble();sc.nextLine();
			if(balance==0)return null; //anche se il bilancio può essere 0, in questo caso non deve esserlo
		} catch (InputMismatchException e) {
			System.err.println("Input non valido, al bilancio verrà assegnato il valore di €0");
			sc.nextLine();
			balance=0;
		}

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
		ps.println(nomeIntestatario+" "+massimoScoperto+" "+balance);
	}

	/**
	 * Confronta due oggetti - ottiene true se il nome dell'intestatario è uguale
	 * @param ba
	 * @return
	 */
	public boolean equals(BankAccount ba) {
		if(nomeIntestatario.equals(ba.nomeIntestatario))
			return true;
		return false;
	}

	/**
	 * Confronta due oggetti - ottiene 0 se l'intestatario è uguale
	 */
	@Override
	public int compareTo(BankAccount ba) {
		return nomeIntestatario.compareTo(ba.nomeIntestatario);
	}

	private String nomeIntestatario;
	private double massimoScoperto, balance;
}
