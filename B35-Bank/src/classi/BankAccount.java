package classi;

public class BankAccount {
	//crea un nuovo conto con bilancio iniziale
	public BankAccount(String nomeIntestatario, double massimoScoperto, double balance) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=massimoScoperto;
		this.balance = balance;
	}

	//crea un nuovo conto senza aggiungere denaro
	public BankAccount(String nomeIntestatario, double massimoScoperto) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=massimoScoperto; //è la somma per cui si può andare sotto il bilancio
		this.balance = 0;
	}
	
	//massimo scoperto mensile predefinito
	public BankAccount(String nomeIntestatario) {
		this.nomeIntestatario=nomeIntestatario;
		this.massimoScoperto=100;
		this.balance = 0;
	}

	public String getNomeIntestatario() {
		return nomeIntestatario;
	}
	
	public double getMassimoScoperto() {
		return massimoScoperto;
	}
	
	//modifica massimo scoperto
	public void setMassimoScoperto(double massimoScoperto) {
		this.massimoScoperto=massimoScoperto;
	}
	
	//saldo
	public double getBalance() {
		return balance;
	}

	//deposito
	public void deposit(double amount) {
		System.out.println("Sto depositando €"+amount);
		this.balance+=amount;
	}

	//prelievo
	public void withdraw(double amount) {
		//verifica sulla possibilità di prelevare
		if (amount<=balance) {
			System.out.println("Sto prelevando €"+amount);
			this.balance-=amount;
		} else {
			System.out.println("Saldo di €"+amount+" non disponibile sul conto");
			System.out.println("Il tuo saldo disponibile è di €"+balance);
		}
	}
	
	//output conto corrente
	public String toString() {
		String stringa=nomeIntestatario+"\n"+massimoScoperto+"\n"+balance;
		
		return stringa;
	}

	private String nomeIntestatario;
	private double massimoScoperto, balance;
}
