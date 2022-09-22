package application;

import entities.Account1;
import entities.BusinesssAccount;
import entities.SavingsAccount;

public class Aula157 {

	public static void main(String[] args) {
		
		Account1 acc = new Account1(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		BusinesssAccount bacc = new BusinesssAccount(1002, "Maria", 0.0, 500.00);
		
		//Upcasting
		Account1 acc1 = bacc;
		acc1.getBalance();
		
		Account1 acc2 = new BusinesssAccount(1003, "Bob", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account1 acc3 = new SavingsAccount(1004, "Ana", 1000.0, 0.01);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
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
		
		System.out.println("---------------------------------------------");
		
		Account1 x = new Account1(1020, "Alex", 1000.0);
		Account1 y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
