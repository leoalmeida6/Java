package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class EC08 {

	public static void main(String[] args) {

		// Locale
		Locale.setDefault(Locale.US);

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double salario, imposto;

		System.out.println("=============================");
		System.out.println("       IMPOSTO DE RENDA      ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe o seu salario: R$ ");
		salario = sc.nextDouble();

		// Pula Linha
		System.out.println("");

		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}
}
