package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class ES02 {

	public static void main(String[] args) {

		// Local US
		Locale.setDefault(Locale.US);

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double raio = 0;
		double area = 0;
		double pi = 3.14159;

		System.out.println("");
		System.out.println("========== CALCULA AREA ==========\n");
		System.out.println("");

		System.out.printf("Informe o valor do raio: ");
		raio = sc.nextDouble();

		area = pi * (raio * raio);

		// Pula Linha
		System.out.println("");

		System.out.printf("O valor da àrea é de %.4f metros.", area);
		sc.close();
	}
}
