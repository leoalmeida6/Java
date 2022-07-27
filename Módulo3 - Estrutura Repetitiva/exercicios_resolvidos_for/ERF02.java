package exercicios_resolvidos_for;

import java.util.Scanner;

public class ERF02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int X = 1; X <= N; X++) {
			int num = sc.nextInt();

			if (num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
