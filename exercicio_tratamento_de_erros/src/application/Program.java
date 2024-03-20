package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, name, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter for withdraw: ");
		Double withdraw = sc.nextDouble();

		try {
			account.wihdraw(withdraw);
			System.out.println(account);
		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
