package exercicios_resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class EC38 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe a quantidade de minutos utilizado: ");
		int minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}

		System.out.printf("Valor a pagar: R$ %.2f%n", conta);

		sc.close();
	}
}
