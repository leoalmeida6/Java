package exercicios_resolvidos;

import java.util.Scanner;

public class ES03 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int A, B, C, D;

		System.out.println("");
		System.out.println("========== CALCULA DA DIFERENÇA ==========\n");
		System.out.println("");

		System.out.printf("Informe o valor de A: ");
		A = sc.nextInt();
		System.out.printf("Informe o valor de B: ");
		B = sc.nextInt();
		System.out.printf("Informe o valor de C: ");
		C = sc.nextInt();
		System.out.printf("Informe o valor de D: ");
		D = sc.nextInt();

		// Pula Linha
		System.out.println("");

		int DIFERENCA = (A * B - C * D);

		System.out.printf("DIFERENÇA = %d", DIFERENCA);

		sc.close();
	}
}
