package application;

import java.util.Scanner;
import java.util.Locale;

public class Negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		
		sc.close();
	}
}
