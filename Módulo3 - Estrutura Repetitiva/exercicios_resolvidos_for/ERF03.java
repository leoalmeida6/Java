package exercicios_resolvidos_for;

import java.util.Locale;
import java.util.Scanner;

public class ERF03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantidade de casos: ");
		int N = sc.nextInt();

		for (int x = 1; x <= N; x++) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();

			double mediaAritmeticaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", mediaAritmeticaPonderada);
		}

		sc.close();
	}
}
