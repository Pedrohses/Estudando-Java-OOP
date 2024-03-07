package application;

import java.util.Locale;
import java.util.Scanner;

import entities.InfosConta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		InfosConta user;

		System.out.println("Enter account number: ");
		int numConta = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter account holder: ");
		String nomeConta = sc.nextLine();

		user = new InfosConta(nomeConta, numConta);
		System.out.println("Is there na initial deposit (y/n)? ");
		char decisao = sc.next().charAt(0);
		
		do {
			switch (decisao) {
			case 'y':
				System.out.println("Enter initial deposit value: ");
				double deposito = sc.nextDouble();
				user = new InfosConta(nomeConta, numConta, deposito);
				break;
			case 'n':
				deposito = 0;
				user = new InfosConta(nomeConta, numConta, deposito);
				break;
			default:
				System.out.println("Por favor, digite uma opção válida");
				sc.nextLine();
				decisao = sc.next().charAt(0);
				while (decisao == 'y') {
					System.out.println("Enter initial deposit value: ");
					deposito = sc.nextDouble();
					user = new InfosConta(nomeConta, numConta, deposito);
					break;
				}
			}
		} while (decisao != 'y' && decisao != 'n');

		System.out.println("Accout data: ");
		System.out.println(user);

		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		user.adicionarContaValor(deposito);
		System.out.println("updated accout data: ");
		System.out.println(user);

		System.out.println("enter a withdraw value: ");
		double removerDinheiro = sc.nextDouble();
		user.removerContaValor(removerDinheiro);
		System.out.println("updated accout data: ");
		System.out.println(user);

		sc.close();

	}

}
