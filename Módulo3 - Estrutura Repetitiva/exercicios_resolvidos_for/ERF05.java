package exercicios_resolvidos_for;

import java.util.Scanner;

public class ERF05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe um número: ");
		int N = sc.nextInt();
		int fatorial = 0;

		for (int x = 0; x <= N; x++) {
			if (fatorial == 0) {
				fatorial = 1;
			} else {
				fatorial *= x;
			}
			// System.out.println(fatorial);
		}
		System.out.println(fatorial);
		sc.close();
	}
}
