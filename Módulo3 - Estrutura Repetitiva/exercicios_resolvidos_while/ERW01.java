package exercicios_resolvidos_while;

import java.util.Scanner;

public class ERW01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("LOGIN: **********");
		System.out.printf("SENHA: ");

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");

			System.out.println("");
			System.out.println("LOGIN: **********");
			System.out.printf("SENHA: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		sc.close();
	}
}
