package exercicios_resolvidos_while;

import java.util.Scanner;

public class ERW02 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Variables
		int x;
		int y;

		System.out.printf("X: ");
		x = sc.nextInt();

		System.out.printf("Y: ");
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");

				System.out.printf("X: ");
				x = sc.nextInt();

				System.out.printf("Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");

				System.out.printf("X: ");
				x = sc.nextInt();

				System.out.printf("Y: ");
				y = sc.nextInt();
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");

				System.out.printf("X: ");
				x = sc.nextInt();

				System.out.printf("Y: ");
				y = sc.nextInt();
			} else {
				System.out.println("Quarto");

				System.out.printf("X: ");
				x = sc.nextInt();

				System.out.printf("Y: ");
				y = sc.nextInt();
			}
		}
		sc.close();
	}
}
