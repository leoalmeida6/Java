package exercicios_resolvidos_while;

import java.util.Scanner;

public class ERW03 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variable
		int alcool = 0, gasolina = 0, diesel = 0, opcao = 0;

		System.out.println("1 - �lcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		System.out.printf("Qual combust�vel? ");
		opcao = sc.nextInt();

		while (opcao != 4) {
			if (opcao == 1) {
				alcool += 1;

				System.out.printf("Qual combust�vel? ");
				opcao = sc.nextInt();
			} else if (opcao == 2) {
				gasolina += 1;

				System.out.printf("Qual combust�vel? ");
				opcao = sc.nextInt();
			} else if (opcao == 3) {
				diesel += 1;

				System.out.printf("Qual combust�vel? ");
				opcao = sc.nextInt();
			} else {
				System.out.println("Op��o invalida. Tente novamente");
				System.out.printf("Qual combust�vel? ");
				opcao = sc.nextInt();
			}
		}

		System.out.println("Muito obrigado!");
		System.out.printf("�lcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}
}
