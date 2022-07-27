package exercicios_resolvidos_for;

import java.util.Scanner;

public class ERF06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
