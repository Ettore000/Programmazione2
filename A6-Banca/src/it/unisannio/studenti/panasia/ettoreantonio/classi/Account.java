package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Account {
	public Account(String accountNumber, double initialBalance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		this.interestRate = interestRate;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public boolean withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			return true;
		} else {
			return false;
		}
	}
	
	public void addInterest() {
		double interest=balance*interestRate;
		balance+=interest;
	}

	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("Account number: "+accountNumber+"\n");
		sb.append("Balance: "+balance+"\n");
		sb.append("Interest rate: "+interestRate);
		
		return sb.toString();
	}
	
	private String accountNumber;
	private double balance, interestRate;
}
