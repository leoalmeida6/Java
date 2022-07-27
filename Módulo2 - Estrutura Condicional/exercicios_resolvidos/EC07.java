package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class EC07 {

	public static void main(String[] args) {

		// Locale
		Locale.setDefault(Locale.US);

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double x, y;

		System.out.println("=============================");
		System.out.println("         COORDENADAS         ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe o EIXO X:");
		x = sc.nextDouble();
		System.out.printf("Informe o EIXO Y:");
		y = sc.nextDouble();

		// Pula Linha
		System.out.println("");

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();
	}
}
