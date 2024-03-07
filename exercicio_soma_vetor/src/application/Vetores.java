package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] numeros = new double[n];

		double sum = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextDouble();
			sum += numeros[i];
		}

		double media = sum / numeros.length;

		System.out.print("VALORES = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf(" %.1f", numeros[i]);
		}

		System.out.println();
		System.out.printf("SOMA = %.2f", sum);
		System.out.printf("MEDIA = %.2f", media);

		sc.close();
	}
}
