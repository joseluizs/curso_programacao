package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Accounts;

public class ExercAula174Excecao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Accounts acc = new Accounts(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		if (amount > acc.getWithdrawLimit()) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit: ");
		} else if (amount > acc.getBalance()) {
			System.out.println("Withdraw error: Not enough balance: ");
		} else {
			acc.witdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}

		sc.close();

	}

}
