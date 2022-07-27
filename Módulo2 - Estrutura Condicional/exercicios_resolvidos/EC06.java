package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class EC06 {

	public static void main(String[] args) {

		// Locale
		Locale.setDefault(Locale.US);

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		double numero;

		System.out.println("=============================");
		System.out.println("          INTERVALOS         ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe a coordenada: ");
		numero = sc.nextDouble();

		// Pula Linha
		System.out.println("");

		if (numero > 0 && numero <= 25) {
			System.out.println("Intervalo [0, 25]");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("Intervalo [25, 50]");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("Intervalo [50, 75]");
		} else if (numero > 75 && numero <= 100) {
			System.out.println("Intervalo [75, 100]");
		} else {
			System.out.println("Fora de intervalo!");
		}
		
		sc.close();
	}
}
