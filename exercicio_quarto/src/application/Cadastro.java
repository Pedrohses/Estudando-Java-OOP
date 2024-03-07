package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Pessoa;

public class Cadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoa = new Pessoa[10];

		String name;
		String email;
		int room;

		System.out.println("How many rooms will be rented? ");
		int roomsRented = sc.nextInt();

		for (int i = 1; i <= roomsRented; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Email: ");
			email = sc.next();
			System.out.println("Room: ");
			room = sc.nextInt();
			pessoa[room] = new Pessoa(name, email, room);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i] != null) {
				System.out.println(pessoa[i]);
			}
		}
		sc.close();
	}
}
