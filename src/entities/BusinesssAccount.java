package entities;

public class BusinesssAccount extends Account1 {
	private Double loanLimit;
	
	public BusinesssAccount() {
		super();
	}

	public BusinesssAccount(Integer number, String holder, Double initialDeposit, Double loanLimit) {
		super(number, holder, initialDeposit);
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
