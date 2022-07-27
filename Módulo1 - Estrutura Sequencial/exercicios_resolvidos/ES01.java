package exercicios_resolvidos;

import java.util.Scanner;

public class ES01 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int a, b, soma = 0;

		System.out.println("");
		System.out.println("========== SISTEMA DE SOMA ==========\n");
		System.out.println("");

		System.out.printf("Informe o valor de A: ");
		a = sc.nextInt();

		System.out.printf("Informe o valor de B: ");
		b = sc.nextInt();

		soma = a + b;
		System.out.printf("\nA soma de %d + %d = %d", a, b, soma);

		sc.close();
	}
}
