package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.IndividualTaxPayer;
import entities.CompanyTaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax players: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company? (i/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			switch(choice){
				case 'i':
					System.out.print("Health expenditures: ");
					Double healthExpenditures = sc.nextDouble();
					list.add(new IndividualTaxPayer(name, anualIncome, healthExpenditures));
					break;
				case 'c':
					System.out.print("Number of employees: ");
					Integer numberEmployee = sc.nextInt();
					list.add(new CompanyTaxPayer(name, anualIncome, numberEmployee));
					break;
			}
		}
		
		Double totalTaxes = 0.0 ;
		
		System.out.println("TAXES PAID:");
		for(TaxPayer taxes : list) {
			totalTaxes += taxes.taxes();
			System.out.println(taxes);
		}
		System.out.printf("TOTAL TAXES: $%.2f", totalTaxes);
		
		sc.close();
	}

}
