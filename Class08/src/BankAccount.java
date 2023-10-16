
public class BankAccount {
	private String accountNumber;
	private int balance;
	
	BankAccount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	int getBalance() {
		return balance;
	}
	
	void deposit(int amount) {
		if(amount < 0) {
			System.err.println("잘못된 입력입니다.");
			return;
		}
		this.balance += amount;
	}
	
	void withdraw(int amount) {
		if(amount < 0 || amount > balance) {
			System.err.println("잘못된 입력입니다. 잔액이 부족합니다.");
			return;
		}
		this.balance -= amount;
	}
}
