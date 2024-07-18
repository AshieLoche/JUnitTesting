package bankAccountPackage;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public double deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}
	
	public double withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
		return balance;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}

