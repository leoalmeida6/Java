package exercicios_resolvidos_for;

import java.util.Scanner;

public class ERF07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de linhas: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
			System.out.print(i * i + " ");
			System.out.print(i * i * i + "\n");
			
		}
		sc.close();
	}

}
