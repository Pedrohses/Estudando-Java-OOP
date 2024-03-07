package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Pessoas;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade, n, qtdMenor16 = 0;
		double altura, altMed = 0.0;

		System.out.println("Quantas pessoa serão digitadas? ");
		n = sc.nextInt();
		Pessoas[] pessoa = new Pessoas[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da pessoa " + (i + 1) + "a pessoa: ");
			System.out.println("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Idade: ");
			idade = sc.nextInt();
			System.out.println("Altura: ");
			altura = sc.nextDouble();

			pessoa[i] = new Pessoas(nome, idade, altura);

			if (pessoa[i].getIdade() < 16) {
				qtdMenor16 += 1;
			}
			altMed += pessoa[i].getAltura();
		}

		altMed /= pessoa.length;
		double porcentagemMenor16 = (double) qtdMenor16 / pessoa.length * 100;

		System.out.printf("Altura média: %.2f%n", altMed);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagemMenor16) + "%");

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}

		System.out.println("Usuários cadastrados: ");
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println(pessoa[i]);
		}
		sc.close();
	}
}
