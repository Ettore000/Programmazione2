package classi;

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
	 * Riassumo un conto corrente
	 * @return stringa
	 */
	public String toString() {
		String stringa=nomeIntestatario+"\n"+massimoScoperto+"\n"+balance;

		return stringa;
	}

	private String nomeIntestatario;
	private double massimoScoperto, balance;
}
