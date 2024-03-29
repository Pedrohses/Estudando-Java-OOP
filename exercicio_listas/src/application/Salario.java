package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CaractFuncionarios;

public class Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<CaractFuncionarios> list = new ArrayList<CaractFuncionarios>();

		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d:%n", i);
			System.out.println("Id:");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary:");
			Double salary = sc.nextDouble();
			CaractFuncionarios funcionario = new CaractFuncionarios(id, name, salary);
			list.add(funcionario);
		}
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:");
		Integer chosenId = sc.nextInt();
		Integer pos = position(list, chosenId);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage:");
			Double percentage = sc.nextDouble();
			list.get(pos).aumentarSalario(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Do you want to fire someone?[s]/[n]");
		char decision = sc.next().charAt(0);
		switch(decision) {
		case 's':
			System.out.println("Enter the ID of the employee you want to fire:");
			Integer dismissId = sc.nextInt();
			dismiss(dismissId, list);
			System.out.println();
			System.out.println("Nova lista de funcionários: ");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			};
			break;
		case 'n':
			break;
		}
		
		sc.close();
	}

	public static Integer position(List<CaractFuncionarios> list, Integer id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return i;
			}
		}
		return null;
	}
	
	public static Boolean hasId(List<CaractFuncionarios> list, Integer id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
	public static void dismiss(Integer dismissId, List<CaractFuncionarios> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(dismissId)) {
				list.remove(i);
			}
		}
	}
}