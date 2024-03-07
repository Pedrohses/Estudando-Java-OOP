package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Aluno;

class Aprovado_ou_reprovado {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + aluno.finalGrade());
		if (aluno.finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + aluno.missingGrade() + " POINTS");
		}
		
		sc.close();
	}
}
