package exercicios_resolvidos_for;

import java.util.Scanner;

public class ERF04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantidade de casos: ");
		int N = sc.nextInt();

		for (int x = 1; x <= N; x++) {
			System.out.printf("\nNúmero1: ");
			double num1 = sc.nextInt();

			System.out.printf("Número2: ");
			double num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("\nDivisão impossível");
			} else {
				double resultado = num1 / num2;
				System.out.println(resultado);
			}
		}

		sc.close();
	}
}
