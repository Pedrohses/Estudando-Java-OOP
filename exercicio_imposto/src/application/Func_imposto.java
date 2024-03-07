package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Salario;

class Func_imposto {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salario pessoa = new Salario();
		
		System.out.println("Name: ");
		pessoa.name = sc.nextLine();
		System.out.println("Gross salary: ");
		pessoa.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		pessoa.tax = sc.nextDouble();
		pessoa.netSalary();
		
		System.out.println("Employee: " + pessoa);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		pessoa.increaseSalary(percentage);
		
		System.out.println("Update data: " + pessoa);

		sc.close();
	}

}
