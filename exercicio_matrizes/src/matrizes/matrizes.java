package matrizes;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas");
		int n = sc.nextInt();
		System.out.println("Digite o número de colunas");
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for (int i = 0; i < matriz.length ; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um número da matriz");
		int numDigitado = sc.nextInt();
		
		for (int i = 0; i < matriz.length ; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (numDigitado == matriz[i][j]) { 
					System.out.println("Position: ");
					System.out.println(i + ", " + j);
					
					if (j != 0) {
						int left = matriz[i][j - 1];
						System.out.println("Left: " + left);
					}
					if (j != (m-1)) {
						int right = matriz[i][j + 1];
						System.out.println("Right: " + right);
					}
					if (i != 0) {
						int up = matriz [i - 1][j];
						System.out.println("Up: " + up);
					}
					if (i != (n-1))  {
						int down = matriz [i + 1][j];
						System.out.println("Down: " + down);
					}
				}	
			}
		}
		sc.close();
	}

}
