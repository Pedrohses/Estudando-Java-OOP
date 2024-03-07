package Application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class CotacaoDolar {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		Calculadora.valorDollar = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		Calculadora.qtdDollar = sc.nextDouble();
		
		System.out.printf("Amount tobe paid in reais = %.2f%n ", Calculadora.Calc());
		
		sc.close();
	}
	
}
