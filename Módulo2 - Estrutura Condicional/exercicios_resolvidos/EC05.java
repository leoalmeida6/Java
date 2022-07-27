package exercicios_resolvidos;

import java.util.Scanner;

public class EC05 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int codigo, quantidade;
		double preco, total;

		System.out.println("=============================");
		System.out.println("        CONTA A PAGAR        ");
		System.out.println("=============================");

		// Pula Linha
		System.out.println("");

		System.out.printf("Informe o código do item: ");
		codigo = sc.nextInt();
		System.out.printf("Informe a quantidade do item: ");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			// Cachorro Quente R$ 4,00
			preco = 4.00;
			total = quantidade * preco;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 2) {
			// X-Salada R$ 4,50
			preco = 4.50;
			total = quantidade * preco;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 3) {
			// X-Bacon R$ 5,00
			preco = 5.00;
			total = quantidade * preco;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 4) {
			// Torrada Simples R$ 2,00
			preco = 2.00;
			total = quantidade * preco;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 5) {
			// Refrigerante R$ 1,50
			preco = 1.50;
			total = quantidade * preco;
			System.out.printf("Total: R$ %.2f%n", total);
		} else {
			System.out.println("Opção invalida!");
		}

		sc.close();
	}
}
