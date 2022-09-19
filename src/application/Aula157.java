package application;

import entities.Account1;
import entities.BusinesssAccount;
import entities.SavingsAccount;

public class Aula157 {

	public static void main(String[] args) {
		
		Account1 acc = new Account1(1001, "Alex", 0.0);
		BusinesssAccount bacc = new BusinesssAccount(1002, "Maria", 0.0, 500.00);
		
		//Upcasting
		Account1 acc1 = bacc;
		Account1 acc2 = new BusinesssAccount(1003, "Bob", 0.0, 200.0);
		Account1 acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//Downcasting
		BusinesssAccount acc4 = (BusinesssAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5  = (BusinessAccount)acc3; dá erro na hora de compilar tem que usar o intanceOf
		if(acc3 instanceof BusinesssAccount) {
			BusinesssAccount acc5 = (BusinesssAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
