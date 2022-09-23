package entities;

import model.exeptions.BusinessExecption;

public class Accounts {
	
	private Integer number;
	private String holder;
	private Double balance; 
	private Double withdrawLimit;
	
	public Accounts() {
	}

	public Accounts(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void witdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			//Gambiarra pq esse tratamento teria que esta na tela de saida e não na regra do negócio.
			throw new BusinessExecption("Withdraw error: The amount exceeds withdraw limit: ");
		} if (amount > getBalance()) {
			throw new BusinessExecption("Withdraw error: Not enough balance: ");
		}

	}
	
	
	
	
}
