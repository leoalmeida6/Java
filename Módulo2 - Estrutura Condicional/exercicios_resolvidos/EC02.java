package exercicios_resolvidos;

import java.util.Scanner;

public class EC02 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int A, B;

		System.out.println("=============================");
		System.out.println("   MULTIPLO ou N�O MULTIPLO  ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe um n�mero: ");
		A = sc.nextInt();
		System.out.printf("Informe outro n�mero: ");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			// Pula Linha
			System.out.println("");

			System.out.printf("%d e %d s�o MULTIPLOS!", A, B);
		} else {
			// Pula Linha
			System.out.println("");

			System.out.printf("%d e %d N�O s�o MULTIPLOS!", A, B);
		}

		sc.close();
	}
}
