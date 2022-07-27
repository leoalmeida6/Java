package exercicios_resolvidos;

import java.util.Scanner;

public class EC01 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int numero;

		System.out.println("=============================");
		System.out.println("    POSITIVO ou NEGATIVO     ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe um número: ");
		numero = sc.nextInt();

		if (numero >= 0) {
			// Pula Linha
			System.out.println("");

			System.out.printf("O número %d é POSITIVO!", numero);
		} else {
			// Pula Linha
			System.out.println("");

			System.out.printf("O número %d é NEGATIVO!", numero);
		}

		sc.close();
	}
}
