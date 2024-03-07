package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Rectangle;

public class Exercise{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		System.out.println("AREA = " + retangulo.Area());
		System.out.println("PERIMETER = " + retangulo.Perimeter());
		System.out.println("DIAGONAL = " + retangulo.Diagonal());
		
		sc.close();
	}
}